package com.labs.sboot.dao;

import com.labs.sboot.model.Order;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import java.util.Collection;
import java.util.List;

@Repository
@Transactional
public class OrderDaoJpaImpl implements OrderDao {

    @PersistenceContext
    private EntityManager entityManager;

    public OrderDaoJpaImpl() {
    }

    @Override
    public int create(Order order) {
//        entityManager.getTransaction().begin();

        entityManager.persist(order);

//        entityManager.getTransaction().commit();

        return order.getId();
    }

    @Override
    public boolean update(int id, Order order) {
//        entityManager.getTransaction().begin();

        order.setId(id);
        Order updatedOrder = entityManager.merge(order);

//        entityManager.getTransaction().commit();
        return updatedOrder != null ? true : false;
    }

    @Override
    public boolean delete(int id) {
//        entityManager.getTransaction().begin();

        Order orderForDelete = entityManager.find(Order.class, id);

        entityManager.remove(orderForDelete);

//        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Order view(int id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public Collection<Order> viewAll() {
//        entityManager.getTransaction().begin();

        List<Order> orders = entityManager.createQuery("FROM Order").getResultList();

//        entityManager.getTransaction().commit();

        return orders;
    }
}
