package com.example.foodorder.repository;

import com.example.foodorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository
        extends JpaRepository<Order, Long> {

}