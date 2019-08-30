package org.enargit.gwt.springbok.services.impl;


import com.google.common.collect.Lists;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;import org.enargit.gwt.springbok.data.entities.BaseEntity;
import org.enargit.gwt.springbok.data.repository.BaseRepository;
import org.enargit.gwt.springbok.services.api.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable, R extends BaseRepository<E, ID>> implements BaseService<E, ID, R> {


    public abstract R getRepository();

    @Override
    public E findById(ID id) {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public List<E> findAll() {
        return Lists.newArrayList(getRepository().findAll());
    }

    @Override
    public E save(E entity) {

        return getRepository().save(entity);
    }

    @Override
    public E update(E entity) {
        return getRepository().save(entity);
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public Page<E> findAllByPage(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    @Override
    public Page<E> findAllByPage(Pageable pageable, Predicate predicate) {
        return getRepository().findAll(predicate, pageable);
    }

    @Override
    public List<E> findAll(Predicate predicate, OrderSpecifier<?>... orderSpecifiers) {
        return Lists.newArrayList(getRepository().findAll(predicate, orderSpecifiers));
    }

    @Override
    public Optional<E> findOneByPredicate(Predicate predicate) {
        return getRepository().findOne(predicate);
    }

    @Override
    public List<E> findAllByPredicate(Predicate predicate) {
        return Lists.newArrayList(getRepository().findAll(predicate));
    }

    @Override
    public void deleteInBatch(Iterable<E> entities) {
        getRepository().deleteAll(entities);
    }

    @Override
    public Iterable<E> saveAll(Iterable<E> entities) {
        return getRepository().saveAll(entities);
    }

    @Override
    public long count() {
        return getRepository().count();
    }

    @Override
    public long count(Predicate predicate) {
        return getRepository().count(predicate);
    }

    @Override
    public boolean exists(Predicate predicate) {
        return getRepository().exists(predicate);
    }

    @Override
    public boolean exists(ID id) {
        return getRepository().existsById(id);
    }
}


