package com.example.foodorder.service;

import com.example.foodorder.entity.Food;
import com.example.foodorder.repository.FoodRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Food not found"));
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public Food updateFood(Long id, Food newFood) {

        Food existingFood = getFoodById(id);

        existingFood.setName(newFood.getName());
        existingFood.setCategory(newFood.getCategory());
        existingFood.setPrice(newFood.getPrice());
        existingFood.setAvailable(newFood.isAvailable());

        return foodRepository.save(existingFood);
    }

    public void deleteFood(Long id) {

        Food food = getFoodById(id);

        foodRepository.delete(food);
    }
}