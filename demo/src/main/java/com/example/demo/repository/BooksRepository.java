package com.example.demo.repository;

import com.example.demo.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at 31 ott 2020, 17:25:45
*/
@Repository
public interface BooksRepository extends JpaRepository<Books, java.lang.Integer> {

}