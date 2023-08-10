package com.nahuelborromeo.retofullstack.repository;

import com.nahuelborromeo.retofullstack.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

}
