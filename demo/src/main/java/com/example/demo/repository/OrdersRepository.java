package com.example.demo.repository;

import com.example.demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at 31 ott 2020, 17:25:45
*/
@Repository
public interface OrdersRepository extends JpaRepository<Orders, java.lang.Integer> {

}