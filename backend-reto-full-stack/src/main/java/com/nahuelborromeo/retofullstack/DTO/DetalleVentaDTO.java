package com.nahuelborromeo.retofullstack.DTO;

public class DetalleVentaDTO {

    private int id;
    private int cantidad;
    private ProductoDTO producto;

    public DetalleVentaDTO() {
    }

    public DetalleVentaDTO(int id, int cantidad, ProductoDTO producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }
}
