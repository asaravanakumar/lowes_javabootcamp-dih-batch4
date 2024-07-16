package com.labs.spring.rest.dao;

import com.labs.spring.rest.model.Order;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Transactional
public class OrderDaoJpaImpl implements OrderDao {

    @Autowired
//    private EntityManagerFactory entityManagerFactory;

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
