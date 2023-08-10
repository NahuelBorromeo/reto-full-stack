package com.nahuelborromeo.retofullstack.controller;


import com.nahuelborromeo.retofullstack.DTO.ProductoDTO;
import com.nahuelborromeo.retofullstack.entity.Producto;
import com.nahuelborromeo.retofullstack.mapper.ProductoMapper;
import com.nahuelborromeo.retofullstack.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping("/register")
    @Operation(summary = "Registrar un nuevo producto.")
    private ResponseEntity<String> registerProducto(@RequestBody ProductoDTO productoDTO) {
        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());

        productoService.save(producto);

        return new ResponseEntity<>("Producto registrado exitosamente.", HttpStatus.CREATED);
    }


    @PostMapping("/update")
    @Operation(summary = "Actualizar un producto existente.")
    private ResponseEntity<String> updateProducto(@RequestParam Long id, @RequestBody ProductoDTO productoDTO) {
        Producto producto = productoService.findById(id).orElse(null);

        if (producto != null) {
            producto.setNombre(productoDTO.getNombre());
            producto.setPrecio(productoDTO.getPrecio());
            productoService.save(producto);
            return new ResponseEntity<>("Producto actualizado exitosamente.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Producto no encontrado.", HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/list")
    @Operation(summary = "Obtener una lista de productos paginada.")
    public Page<ProductoDTO> listProducts(@RequestParam(defaultValue = "0") int page) {
        int itemsPerPage = 10;
        Page<Producto> productoPage = productoService.findAll(PageRequest.of(page, itemsPerPage));

        Page<ProductoDTO> productoDTOPage = productoPage.map(ProductoMapper::toDto);

        return productoDTOPage;
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un producto por su ID.")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {

        Producto producto = productoService.findById(id).orElse(null);

        if(producto != null) {
            productoService.delete(producto);
            return new ResponseEntity<>("Producto eliminado exitosamente.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No se encontró el producto con ID " + id, HttpStatus.NOT_FOUND);
        }

    }

}
