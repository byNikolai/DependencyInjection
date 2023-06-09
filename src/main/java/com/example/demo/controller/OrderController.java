package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
@GetMapping("add")
    public List<Integer> addToCart(@RequestParam List<Integer> ID) {
        return orderService.addToCart(ID);
    }
@GetMapping("get")
    public List<Integer> getItem(@RequestParam List<Integer> ID) {
        return orderService.getItem(ID);
    }
}
