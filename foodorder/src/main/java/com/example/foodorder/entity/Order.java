package com.example.foodorder.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private Integer quantity;

    private double totalPrice;

    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;

    public Order() {
    }

    public Order(String customerName, Integer quantity,
                 double totalPrice, Food food) {
        this.customerName = customerName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.food = food;
        this.orderDate = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}