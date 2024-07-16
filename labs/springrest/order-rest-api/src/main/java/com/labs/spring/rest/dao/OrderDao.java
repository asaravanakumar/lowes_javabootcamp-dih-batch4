package com.labs.spring.rest.dao;


import com.labs.spring.rest.model.Order;

import java.util.Collection;

public interface OrderDao {
    public int create(Order order);
    public boolean update(int id, Order order);
    public boolean delete(int id);
    public Order view(int id);
    public Collection<Order> viewAll();
}
