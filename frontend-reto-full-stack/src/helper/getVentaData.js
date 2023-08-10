import dayjs from "dayjs";


export const getVentaData = (ventas) => {
  
    const rows = ventas.map(venta => {
        
        const totalVentas = venta.detalleVentas.map(detalleVenta => {
            return detalleVenta.cantidad * detalleVenta.producto.precio;
        });

        const total = totalVentas.reduce((acc, current) => acc + current, 0);

        return {
            id: venta.id,
            cliente: venta.cliente.nombres + ' ' + venta.cliente.apellidos,
            fecha: dayjs(venta.fecha).format('DD-MM-YYYY'),
            total: total,
            detalle: venta,
        }
    })

    return rows;

}
