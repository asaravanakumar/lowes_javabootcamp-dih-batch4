package com.labs.java.jpa.dao;

import com.labs.java.jpa.model.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import java.util.Collection;
import java.util.List;

public class OrderDaoJpaImpl implements OrderDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    public OrderDaoJpaImpl() {
        if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("com.labs.java.jpa");
            entityManager = entityManagerFactory.createEntityManager();
        }
    }

    @Override
    public int create(Order order) {
        entityManager.getTransaction().begin();

        entityManager.persist(order);

        entityManager.getTransaction().commit();

        return order.getId();
    }

    @Override
    public boolean update(int id, Order order) {
        entityManager.getTransaction().begin();

        order.setId(id);
        Order updatedOrder = entityManager.merge(order);

        entityManager.getTransaction().commit();
        return updatedOrder != null ? true : false;
    }

    @Override
    public boolean delete(int id) {
        entityManager.getTransaction().begin();

        Order orderForDelete = entityManager.find(Order.class, id);

        entityManager.remove(orderForDelete);

        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Order view(int id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public Collection<Order> viewAll() {
        entityManager.getTransaction().begin();

        List<Order> orders = entityManager.createQuery("FROM Order").getResultList();

        entityManager.getTransaction().commit();

        return orders;
    }
}
