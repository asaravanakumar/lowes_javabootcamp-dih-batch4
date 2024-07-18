package com.labs.sboot.repo;

import com.labs.sboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    public List<Order> findByCategory(String category);

    public List<Order> findByCategoryAndQuantity(String category, int quantity);

    @Query("SELECT o.category, count(*) FROM Order o GROUP BY o.category")
    public Map<String,Integer> getCategoryWiseCount();
}
