package com.nahuelborromeo.retofullstack.repository;

import com.nahuelborromeo.retofullstack.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
