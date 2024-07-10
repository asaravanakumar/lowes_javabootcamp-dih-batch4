package com.labs.java.jpa.service;

import com.labs.java.jpa.dao.OrderDao;
import com.labs.java.jpa.dao.OrderDaoJpaImpl;
import com.labs.java.jpa.model.Order;

import java.util.Collection;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao = new OrderDaoJpaImpl();

    @Override
    public int create(Order order) {
        // TODO: Validation
        return orderDao.create(order);
    }

    @Override
    public boolean update(int id, Order order) {
        return orderDao.update(id, order);
    }

    @Override
    public boolean delete(int id) {
        return orderDao.delete(id);
    }

    @Override
    public Order view(int id) {
        return orderDao.view(id);
    }

    @Override
    public Collection<Order> viewAll() {
        return orderDao.viewAll();
    }
}
