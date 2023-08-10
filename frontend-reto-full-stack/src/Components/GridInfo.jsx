import { DataGrid } from '@mui/x-data-grid';
import { Button } from '@mui/material';
import { useState } from 'react';
import { DetalleModal } from './Modals/DetalleModal';


export const GridInfo = ({ rows }) => {

    const [open, setOpen] = useState(false);
    const [ventaSeleccionada, setVentaSeleccionada] = useState([]);
    const [total, setTotal] = useState(null);

    const handleDetalleClick = (venta) => {
        setOpen(true);
        setVentaSeleccionada(venta);
        const totalVentas = venta.detalleVentas.map(detalleVenta => {
            return detalleVenta.cantidad * detalleVenta.producto.precio;
        });

        const total = totalVentas.reduce((acc, current) => acc + current, 0);

        setTotal(total);

    };
    const handleClose = () => {
        setOpen(false);
        setVentaSeleccionada([]);
    }

    const columns = [
        { field: 'cliente', headerName: 'Cliente', minWidth: 400 },
        { field: 'fecha', headerName: 'Fecha', minWidth: 150 },
        {
          field: 'total',
          headerName: 'Total',
          type: 'number',
          minWidth: 150,
        },
        {
          field: 'detalle',
          headerName: 'Ver detalle',
          sortable: false,
            minWidth: 160,
          renderCell: (params) => (
              <Button
              variant="contained"
              onClick={() => handleDetalleClick(params.value)}
            >
              Ver detalle
            </Button>
          )
        },
    ];

    
  return (
    <div style={{ height: 400, maxWidth: '80%', margin: '0 auto' }}>
    <DataGrid
        slots={{
          noRowsOverlay: <p>No hay ventas registradas para esa fecha.</p>,
      }}
      rows={rows}
      columns={columns}
      initialState={{
        pagination: {
          paginationModel: { page: 0, pageSize: 5 },
        },
      }}
      disableRowSelectionOnClick
          />
          
          <DetalleModal
              modalTitle='Detalle de venta'
              isOpen={open}
              handleClose={handleClose}
              venta={ventaSeleccionada}
              total={total}
          />
    </div>
    )
}
