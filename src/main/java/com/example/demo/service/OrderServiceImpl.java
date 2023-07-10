package com.example.demo.service;

import com.example.demo.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addToCart(List<Integer> ID) {
        return cart.addToCart(ID);
    }

    @Override
    public List<Integer> getItem(List<Integer> ID) {
        return cart.getItems();
    }
}
