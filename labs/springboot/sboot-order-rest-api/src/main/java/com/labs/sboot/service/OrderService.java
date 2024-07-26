package com.labs.sboot.service;

import com.labs.sboot.model.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrderService {
    public int create(Order order);
    public boolean update(int id, Order order);
    public boolean delete(int id);
    public Order view(int id);
    public Collection<Order> viewAll();
    public default List<Map<String, Integer>> getCategoryWiseCount() {
        return List.of(new HashMap<>());
    };
}
