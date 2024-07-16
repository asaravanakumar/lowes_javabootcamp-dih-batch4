package com.labs.spring.rest.service;



import com.labs.spring.rest.dao.OrderDao;
import com.labs.spring.rest.dao.OrderDaoJpaImpl;
import com.labs.spring.rest.model.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;


public class OrderServiceImpl implements OrderService {

//    private OrderDao orderDao = new OrderDaoJpaImpl();

    @Autowired
    private OrderDao orderDao;

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
