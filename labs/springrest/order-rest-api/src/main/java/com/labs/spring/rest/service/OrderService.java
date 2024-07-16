package com.labs.spring.rest.service;

import com.labs.spring.rest.model.Order;

import java.util.Collection;

public interface OrderService {
    public int create(Order order);
    public boolean update(int id, Order order);
    public boolean delete(int id);
    public Order view(int id);
    public Collection<Order> viewAll();
}
