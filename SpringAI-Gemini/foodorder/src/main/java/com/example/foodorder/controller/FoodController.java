package com.example.foodorder.controller;

import com.example.foodorder.entity.Food;
import com.example.foodorder.service.FoodService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping("/{foodId}")
    public Food getFoodById(@PathVariable Long foodId) {
        return foodService.getFoodById(foodId);
    }

    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return foodService.addFood(food);
    }

    @PutMapping("/{foodId}")
    public Food updateFood(
            @PathVariable Long foodId,
            @RequestBody Food food) {

        return foodService.updateFood(foodId, food);
    }

    @DeleteMapping("/{foodId}")
    public String deleteFood(@PathVariable Long foodId) {

        foodService.deleteFood(foodId);

        return "Food deleted successfully";
    }
}