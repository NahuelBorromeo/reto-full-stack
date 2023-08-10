package com.nahuelborromeo.retofullstack.mapper;

import com.nahuelborromeo.retofullstack.DTO.DetalleVentaDTO;
import com.nahuelborromeo.retofullstack.entity.DetalleVenta;

import java.util.List;
import java.util.stream.Collectors;

public class DetalleVentaMapper {

    public static DetalleVentaDTO toDto(DetalleVenta detalleVenta) {
        DetalleVentaDTO detalleVentaDTO = new DetalleVentaDTO();
        detalleVentaDTO.setId(detalleVenta.getId());
        detalleVentaDTO.setCantidad(detalleVenta.getCantidad());
        detalleVentaDTO.setProducto(ProductoMapper.toDto(detalleVenta.getProducto()));
        return detalleVentaDTO;
    }

    public static List<DetalleVentaDTO> toDtoList(List<DetalleVenta> detalleVentas) {
        return detalleVentas.stream()
                .map(DetalleVentaMapper::toDto)
                .collect(Collectors.toList());
    }
}

