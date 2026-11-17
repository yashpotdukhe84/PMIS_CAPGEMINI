package com.example.foodorder.service;

import com.example.foodorder.dto.OrderRequest;
import com.example.foodorder.entity.Food;
import com.example.foodorder.entity.Order;
import com.example.foodorder.repository.FoodRepository;
import com.example.foodorder.repository.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final FoodRepository foodRepository;

    public OrderService(OrderRepository orderRepository,
                        FoodRepository foodRepository) {
        this.orderRepository = orderRepository;
        this.foodRepository = foodRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));
    }

    public Order createOrder(OrderRequest request) {

        Food food = foodRepository.findById(request.getFoodId())
                .orElseThrow(() ->
                        new RuntimeException("Food not found"));

        if (!food.isAvailable()) {
            throw new RuntimeException("Food is not available");
        }

        if (request.getQuantity() == null ||
                request.getQuantity() <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero");
        }

        double totalPrice =
                food.getPrice() * request.getQuantity();

        Order order = new Order(
                request.getCustomerName(),
                request.getQuantity(),
                totalPrice,
                food
        );

        return orderRepository.save(order);
    }
}