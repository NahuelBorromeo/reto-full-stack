package com.nahuelborromeo.retofullstack.mapper;

import com.nahuelborromeo.retofullstack.DTO.DetalleVentaDTO;
import com.nahuelborromeo.retofullstack.DTO.VentaDTO;
import com.nahuelborromeo.retofullstack.entity.Venta;

import java.util.List;
import java.util.stream.Collectors;

public class VentaMapper {

    public static VentaDTO toDto(Venta venta) {
        VentaDTO ventaDTO = new VentaDTO();
        ventaDTO.setId(venta.getId());
        ventaDTO.setFecha(venta.getFecha());
        ventaDTO.setCliente(ClienteMapper.toDto(venta.getCliente()));

        List<DetalleVentaDTO> detalleVentaDTOs = venta.getDetalleVentas().stream()
                .map(DetalleVentaMapper::toDto)
                .collect(Collectors.toList());
        ventaDTO.setDetalleVentas(detalleVentaDTOs);

        return ventaDTO;
    }

    public static List<VentaDTO> toDtoList(List<Venta> ventas) {
        return ventas.stream()
                .map(VentaMapper::toDto)
                .collect(Collectors.toList());
    }
}

