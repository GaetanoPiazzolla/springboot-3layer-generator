package com.example.demo.controller.dto;

import lombok.Data;

/**
* Generated by Springboot-3layer-Generator at Feb 22, 2023, 1:38:03 PM
*/
@Data
public class OrderDTO {

    private long serialVersionUID;
    private java.lang.Integer orderId;
    private java.lang.Integer quantity;
    private com.example.demo.model.Book book;
    private com.example.demo.model.User user;

}
