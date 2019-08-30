package org.enargit.gwt.springbok.data.repository;

import org.enargit.gwt.springbok.data.entities.BaseEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;


public interface BaseRepository<E extends BaseEntity, ID extends Serializable> extends PagingAndSortingRepository<E, ID>, QuerydslPredicateExecutor<E> {



}
