package com.labs.sboot.service;



import com.labs.sboot.dao.OrderDao;
import com.labs.sboot.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class OrderServiceJpaImpl implements OrderService {

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
