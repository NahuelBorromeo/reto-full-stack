package com.nahuelborromeo.retofullstack.DTO;

import java.util.Date;
import java.util.List;

public class VentaDTO {

    private int id;
    private Date fecha;
    private ClienteDTO cliente;
    private List<DetalleVentaDTO> detalleVentas;

    public VentaDTO() {
    }

    public VentaDTO(int id, Date fecha, ClienteDTO cliente, List<DetalleVentaDTO> detalleVentas) {
        this.id = id;
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

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVentaDTO> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVentaDTO> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }
}

