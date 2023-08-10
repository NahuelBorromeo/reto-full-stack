package com.nahuelborromeo.retofullstack.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int id;

    @NonNull
    private String nombre;
    @NonNull
    private double precio;

    @OneToMany(mappedBy = "producto")
    @NonNull
    private List<DetalleVenta> detalleVentas = new ArrayList<>();

    public Producto() {
    }

    public Producto(String nombre, double precio, List<DetalleVenta> detalleVentas) {
        this.nombre = nombre;
        this.precio = precio;
        this.detalleVentas = detalleVentas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
}
