package com.labs.java.jpa.dao;

import com.labs.java.jpa.model.Order;

import java.util.Collection;

public interface OrderDao {
    public int create(Order order);
    public boolean update(int id, Order order);
    public boolean delete(int id);
    public Order view(int id);
    public Collection<Order> viewAll();
}
