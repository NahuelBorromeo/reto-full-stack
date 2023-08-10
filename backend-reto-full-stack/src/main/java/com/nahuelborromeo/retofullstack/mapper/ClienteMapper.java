package com.nahuelborromeo.retofullstack.mapper;

import com.nahuelborromeo.retofullstack.DTO.ClienteDTO;
import com.nahuelborromeo.retofullstack.entity.Cliente;
import com.nahuelborromeo.retofullstack.entity.Venta;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteMapper {

    public static ClienteDTO toDto(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setId(cliente.getId());
        clienteDTO.setNombres(cliente.getNombres());
        clienteDTO.setApellidos(cliente.getApellidos());
        clienteDTO.setDni(cliente.getDni());
        clienteDTO.setTelefono(cliente.getTelefono());
        clienteDTO.setEmail(cliente.getEmail());

        return clienteDTO;
    }

    public static List<ClienteDTO> toDtoList(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteMapper::toDto)
                .collect(Collectors.toList());
    }
}

