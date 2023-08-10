package com.nahuelborromeo.retofullstack.controller;



import com.nahuelborromeo.retofullstack.entity.DetalleVenta;
import com.nahuelborromeo.retofullstack.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalle-venta")
public class DetalleVentaController {

    @Autowired
    DetalleVentaService detalleVentaService;


}
