package com.example.demo.controller.dto;

import lombok.Data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 11:09:45 AM
*/
@Data
public class OrderDTO {

    private long serialVersionUID;
    private java.lang.Integer orderId;
    private java.lang.Integer quantity;
    private com.example.demo.model.Book book;
    private com.example.demo.model.User user;

}
