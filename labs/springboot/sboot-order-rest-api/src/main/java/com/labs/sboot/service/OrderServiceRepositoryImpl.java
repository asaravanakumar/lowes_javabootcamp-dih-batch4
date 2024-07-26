package com.labs.sboot.service;

import com.labs.sboot.model.Order;
import com.labs.sboot.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
@Primary
public class OrderServiceRepositoryImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public int create(Order order) {
        orderRepo.save(order);
        return order.getId();
    }

    @Override
    public boolean update(int id, Order order) {
        order.setId(id);
        return orderRepo.save(order) != null ? true : false;
    }

    @Override
    public boolean delete(int id) {
        orderRepo.deleteById(id);
        return true;
    }

    @Override
    public Order view(int id) {
        return orderRepo.findById(id).get();
    }

    @Override
    public Collection<Order> viewAll() {
        return orderRepo.findAll();
    }

    @Override
    public List<Map<String, Integer>> getCategoryWiseCount() {
        return orderRepo.getCategoryWiseCount();
    }
}
