package com.example.demo.service.mapper;

import com.example.demo.model.Users;
import com.example.demo.controller.dto.UsersDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at 31 ott 2020, 17:25:45
*/
@Mapper(componentModel = "spring")
public interface UsersMapper {

    Users toEntity(UsersDTO dto);

    UsersDTO toDto(Users entity);

}