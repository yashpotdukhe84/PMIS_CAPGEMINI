package com.example.foodorder.repository;

import com.example.foodorder.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository
        extends JpaRepository<Food, Long> {

}