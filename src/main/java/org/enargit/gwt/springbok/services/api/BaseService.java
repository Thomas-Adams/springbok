package org.enargit.gwt.springbok.services.api;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.enargit.gwt.springbok.data.entities.BaseEntity;
import org.enargit.gwt.springbok.data.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<E extends BaseEntity, ID extends Serializable, R extends BaseRepository<E, ID>> {

    R getRepository();

    E findById(ID id);

    Iterable<E> findAll();

    E save(E entity);

    E update(E entity);

    void delete(ID id);

    Page<E> findAllByPage(Pageable pageable);

    List<E> findAllByPageAsList(Pageable pageable);

    Page<E> findAllByPage(Pageable pageable, Predicate predicate);

    List<E> findAllByPageAsList(Pageable pageable, Predicate predicate);

    List<E> findAll(Predicate predicate, OrderSpecifier<?>... orderSpecifiers);

    Optional<E> findOneByPredicate(Predicate predicate);

    List<E> findAllByPredicate(Predicate predicate);

    void deleteInBatch(Iterable<E> entities);

    Iterable<E> saveAll(Iterable<E> entities);

    long count();

    long count(Predicate predicate);

    boolean exists(Predicate predicate);

    boolean exists(ID id);

}