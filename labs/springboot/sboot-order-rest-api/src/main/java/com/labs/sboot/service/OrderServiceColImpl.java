package com.labs.sboot.service;

import com.labs.sboot.model.Order;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceColImpl implements OrderService {

    private Map<Integer, Order> orders = new HashMap<>();

    @Override
    public int create(Order order) {
//        order.setId(orders.size() + 1);
       orders.put(order.getId(), order);
        return order.getId();
    }

    @Override
    public boolean update(int id, Order order) {
         return orders.put(id, order) != null ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return orders.remove(id) != null ? true : false;
    }

    @Override
    public Order view(int id) {
        return orders.get(id);
    }

    @Override
    public Collection<Order> viewAll() {
        return orders.values();
    }
}
