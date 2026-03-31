package com.ecommerce.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping
    public List<Map<String, Object>> getAllUsers() {
        return List.of(
            Map.of("userId", 1, "name", "John Doe"),
            Map.of("userId", 2, "name", "Jane Doe")
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getUserById(@PathVariable int id) {
        return Map.of(
            "userId", id,
            "name", "Sample User"
        );
    }
}
