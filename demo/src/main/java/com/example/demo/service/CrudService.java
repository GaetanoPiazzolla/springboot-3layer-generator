package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 10:03:25 AM
*/
public interface CrudService<E,P> {

    E create(E entity);

    E update(E entity);

    Page<E> read(E entity, Pageable pageable);
    E readOne(P primaryKey);

    void delete(P primaryKey);

}