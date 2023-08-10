package com.nahuelborromeo.retofullstack.repository;

import com.nahuelborromeo.retofullstack.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {

    List<Venta> findByFecha(Date fecha);

}
