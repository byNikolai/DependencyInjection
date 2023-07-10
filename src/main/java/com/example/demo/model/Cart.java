package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addToCart(List<Integer> ID) {
        this.items.addAll(ID);
        return this.items;
    }
    public List<Integer> getItems() {
        return this.items;
    }
}
