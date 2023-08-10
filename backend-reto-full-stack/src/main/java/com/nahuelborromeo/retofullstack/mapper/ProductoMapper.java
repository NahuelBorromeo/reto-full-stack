package com.nahuelborromeo.retofullstack.mapper;

import com.nahuelborromeo.retofullstack.DTO.DetalleVentaDTO;
import com.nahuelborromeo.retofullstack.DTO.ProductoDTO;
import com.nahuelborromeo.retofullstack.entity.Producto;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoMapper {

    public static ProductoDTO toDto(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setId(producto.getId());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setPrecio(producto.getPrecio());

        return productoDTO;
    }

    public static List<ProductoDTO> toDtoList(List<Producto> productos) {
        return productos.stream()
                .map(ProductoMapper::toDto)
                .collect(Collectors.toList());
    }
}

