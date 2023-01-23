package com.example.demo.service.mapper;

import com.example.demo.model.Order;
import com.example.demo.controller.dto.OrderDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 11:09:45 AM
*/
@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderDTO dto);

    OrderDTO toDto(Order entity);

}