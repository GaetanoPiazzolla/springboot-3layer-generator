package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 10:35:30 AM
*/
@Repository
public interface BookRepository extends JpaRepository<Book, java.lang.Integer> {

}