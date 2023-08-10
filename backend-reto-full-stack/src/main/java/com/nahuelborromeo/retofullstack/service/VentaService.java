package com.nahuelborromeo.retofullstack.service;

import com.nahuelborromeo.retofullstack.entity.Venta;
import com.nahuelborromeo.retofullstack.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class VentaService implements VentaRepository {

    @Autowired
    VentaRepository ventaRepository;

    @Override
    public List<Venta> findByFecha(Date fecha) {
        return ventaRepository.findByFecha(fecha);
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Venta> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Venta> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Venta> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Venta getOne(Long aLong) {
        return null;
    }

    @Override
    public Venta getById(Long aLong) {
        return null;
    }

    @Override
    public Venta getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Venta> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Venta> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Venta> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Venta> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Venta> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Venta> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Venta, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Venta> S save(S venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public <S extends Venta> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    @Override
    public List<Venta> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Venta entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Venta> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Venta> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Venta> findAll(Pageable pageable) {
        return null;
    }
}
