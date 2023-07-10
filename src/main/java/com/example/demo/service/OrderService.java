package com.example.demo.service;

import java.util.List;

public interface OrderService {
    List<Integer> addToCart(List<Integer> ID);
    List<Integer> getItem(List<Integer> ID);

}
