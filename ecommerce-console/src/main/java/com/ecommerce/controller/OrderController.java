package com.ecommerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @GetMapping
    public List<Map<String, Object>> getAllOrders() {
        return List.of(
            Map.of("orderId", 1, "total", 100),
            Map.of("orderId", 2, "total", 250)
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getOrderById(@PathVariable int id) {
        return Map.of(
            "orderId", id,
            "total", 150
        );
    }
}
