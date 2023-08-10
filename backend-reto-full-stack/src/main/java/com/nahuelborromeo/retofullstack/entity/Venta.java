package com.nahuelborromeo.retofullstack.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int id;

    @NonNull
    private Date fecha;

    @ManyToOne
    @JoinColumn( name = "cliente_id")
    @NonNull
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    @NonNull
    private List<DetalleVenta> detalleVentas = new ArrayList<>();

    public Venta() {
    }

    public Venta(Date fecha, Cliente cliente, List<DetalleVenta> detalleVentas) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalleVentas = detalleVentas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
}
