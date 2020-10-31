package com.example.demo.service.mapper;

import com.example.demo.model.Books;
import com.example.demo.controller.dto.BooksDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at 31 ott 2020, 17:25:45
*/
@Mapper(componentModel = "spring")
public interface BooksMapper {

    Books toEntity(BooksDTO dto);

    BooksDTO toDto(Books entity);

}