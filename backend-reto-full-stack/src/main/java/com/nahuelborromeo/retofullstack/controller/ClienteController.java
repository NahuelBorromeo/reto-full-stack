package com.nahuelborromeo.retofullstack.controller;

import com.nahuelborromeo.retofullstack.DTO.ClienteDTO;
import com.nahuelborromeo.retofullstack.entity.Cliente;
import com.nahuelborromeo.retofullstack.mapper.ClienteMapper;
import com.nahuelborromeo.retofullstack.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/list")
    @Operation(summary = "Obtener la lista de clientes.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista traida",
                content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Cliente.class))}
            )
    })
    public ResponseEntity<List<ClienteDTO>> listClientes() {
        List<Cliente> clientes = clienteService.findAll();
        List<ClienteDTO> clienteDTOs = ClienteMapper.toDtoList(clientes);
        return ResponseEntity.ok(clienteDTOs);
    }

    @PostMapping("/register")
    @Operation(summary = "Registrar un nuevo cliente.")
    private ResponseEntity<String> registerCliente(@RequestParam Cliente cliente) {

        clienteService.save(cliente);

        return new ResponseEntity<>("Cliente registrado exitosamente.", HttpStatus.CREATED);

    }



}
