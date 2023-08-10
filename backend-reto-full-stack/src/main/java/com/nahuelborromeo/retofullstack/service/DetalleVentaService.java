package com.nahuelborromeo.retofullstack.service;

import com.nahuelborromeo.retofullstack.entity.DetalleVenta;
import com.nahuelborromeo.retofullstack.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class DetalleVentaService implements DetalleVentaRepository{

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;


    @Override
    public <S extends DetalleVenta> S save(S entity) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<DetalleVenta> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<DetalleVenta> findAll() {
        return null;
    }

    @Override
    public List<DetalleVenta> findAllById(Iterable<Long> id) {
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
    public void delete(DetalleVenta entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends DetalleVenta> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends DetalleVenta> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DetalleVenta> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public DetalleVenta getOne(Long aLong) {
        return null;
    }

    @Override
    public DetalleVenta getById(Long aLong) {
        return null;
    }

    @Override
    public DetalleVenta getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DetalleVenta> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DetalleVenta> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DetalleVenta> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends DetalleVenta, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<DetalleVenta> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<DetalleVenta> findAll(Pageable pageable) {
        return null;
    }
}
