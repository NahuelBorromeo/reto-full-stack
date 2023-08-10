package com.nahuelborromeo.retofullstack.repository;

import com.nahuelborromeo.retofullstack.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
