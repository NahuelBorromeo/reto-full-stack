package com.nahuelborromeo.retofullstack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table (name = "detalleVenta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int id;

    @NonNull
    private int cantidad;

    @ManyToOne
    @JoinColumn( name = "venta_id")
    @NonNull
    private Venta venta;

    @ManyToOne
    @JoinColumn( name = "producto_id")
    @NonNull
    private Producto producto;


    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, Venta venta, Producto producto) {
        this.cantidad = cantidad;
        this.venta = venta;
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

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
