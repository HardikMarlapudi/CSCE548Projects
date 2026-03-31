package com.ecommerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @GetMapping
    public List<Map<String, Object>> getAllProducts() {
        return List.of(
            Map.of("productId", 1, "name", "Laptop", "price", 1200),
            Map.of("productId", 2, "name", "Phone", "price", 800)
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getProductById(@PathVariable int id) {
        return Map.of(
            "productId", id,
            "name", "Sample Product",
            "price", 999
        );
    }
}
