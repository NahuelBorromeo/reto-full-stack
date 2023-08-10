import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Modal from '@mui/material/Modal';
import './DetalleModal.css'
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import dayjs from 'dayjs';

const style = {
  position: 'absolute',
  top: '50%',
  left: '50%',
  transform: 'translate(-50%, -50%)',
    width: 'auto',
  bgcolor: '#F3F3F3',
  border: '2px solid #000',
  boxShadow: 24,
  p: 4,
};

export const DetalleModal = ({ modalTitle, venta, total, isOpen, handleClose }) => {
  const internalHandleClose = () => {
    handleClose();
    };
    
    const rows = isOpen && venta.detalleVentas.map(detalleVenta => {
      
        return {
            producto: detalleVenta.producto.nombre,
            precioUnitario: detalleVenta.producto.precio,
            cantidad: detalleVenta.cantidad,
            subTotal: detalleVenta.cantidad * detalleVenta.producto.precio,
        }
    })


  return (
    <div>
      <Modal
        open={isOpen}
        onClose={internalHandleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Typography id="modal-modal-title" variant="h6" component="h2">
            {modalTitle}
                  </Typography>
          {isOpen &&
                          <div className='detalleVentaContainer'>
                          <h3>Cliente</h3>
                            <div style={{ display: 'flex', justifyContent: 'space-between'}}>
                                <span><b>Nombres:</b> {venta.cliente.nombres}</span>
                                <span><b>Apellidos:</b> {venta.cliente.apellidos}</span>
                                <span><b>Dni:</b> {venta.cliente.dni}</span>
                              </div>
                            <div style={{ display: 'flex', justifyContent: 'space-between'}}>
                            <span><b>Teléfono:</b> {venta.cliente.telefono}</span>
                            <span><b>Email:</b> {venta.cliente.email}</span>
                            </div>
                            <TableContainer component={Paper}>
                                <Table sx={{ minWidth: 650 }} aria-label="simple table">
                                    <TableHead>
                                        <TableRow>
                                            <TableCell>Producto</TableCell>
                                            <TableCell>Precio unitario</TableCell>
                                            <TableCell>Cantidad</TableCell>
                                            <TableCell>SubTotal</TableCell>
                                        </TableRow>
                                      </TableHead>
                                      <TableBody>
                                        {rows.map((row) => (
                                            <TableRow
                                            key={row.producto}
                                            sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                                            >
                                            <TableCell component="th" scope="row">
                                                {row.producto}
                                            </TableCell>
                                            <TableCell>{row.precioUnitario}</TableCell>
                                            <TableCell>{row.cantidad}</TableCell>
                                            <TableCell>{row.subTotal}</TableCell>
                                            </TableRow>
                                        ))}
                                        </TableBody>
                                </Table>
                              </TableContainer>
                              <div style={{ display: 'flex', justifyContent: 'space-between'}}>
                                <span><b>Fecha:</b> {dayjs(venta.fecha).format('DD-MM-YYYY')}</span>
                                <span><b>Total:</b> {total}</span>  
                              </div>
                          </div>
          }
        </Box>
      </Modal>
    </div>
  );
}

