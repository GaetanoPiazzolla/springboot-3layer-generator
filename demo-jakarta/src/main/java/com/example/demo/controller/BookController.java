package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 11:09:45 AM
*/
@RestController
@RequestMapping("/book/")
public class BookController implements CrudController<Book,java.lang.Integer>{

    @Autowired
    private BookService service;

    @Override
    public ResponseEntity<Book> create(@RequestBody Book entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<Book> update(@RequestBody Book entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<Book>> read(
            @RequestBody Book entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<Book> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}