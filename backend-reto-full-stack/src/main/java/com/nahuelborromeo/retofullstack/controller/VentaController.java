package com.nahuelborromeo.retofullstack.controller;

import com.nahuelborromeo.retofullstack.DTO.VentaDTO;
import com.nahuelborromeo.retofullstack.entity.Venta;
import com.nahuelborromeo.retofullstack.mapper.VentaMapper;
import com.nahuelborromeo.retofullstack.service.VentaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @GetMapping("/list")
    @Operation(summary = "Obtener la lista de ventas.")
    public ResponseEntity<List<VentaDTO>> listVentas() {
        List<Venta> ventas = ventaService.findAll();

        // Mapear la lista de Ventas a una lista de VentaDTO utilizando el mapeador VentaMapper
        List<VentaDTO> ventaDTOs = ventas.stream()
                .map(VentaMapper::toDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(ventaDTOs);
    }

    @GetMapping("/findByFecha")
    @Operation(summary = "Obtener la lista de ventas en una fecha determinada.")
    public ResponseEntity<List<VentaDTO>> findVentasByFecha(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha) {
        List<Venta> ventas = ventaService.findByFecha(fecha);
        List<VentaDTO> ventaDTOs = ventas.stream().map(VentaMapper::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(ventaDTOs);
    }


}
