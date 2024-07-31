package com.labs.sboot.repo;

import com.labs.sboot.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@DataJpaTest
class OrderRepositoryTests {

    @Autowired
    private OrderRepository orderRepo;

    @BeforeEach
    void setUp() {
        Order order1 = new Order("Lenovo ThinkPad", "Laptops", 10, 75000.0 );
        Order order2 = new Order("HP Pavilion", "Laptops", 5, 85000.0 );
        Order order3 = new Order("Apple iPhone15", "SmartPhones", 10, 70000.0 );

        orderRepo.save(order1);
        orderRepo.save(order2);
        orderRepo.save(order3);
    }

    @AfterEach
    void tearDown() {
        orderRepo.deleteAll();
    }

    // given_when_then

    // givenValidCategoryWhenFindByCategoryThenReturnCategoryCount
    // givenInvalidCategoryWhenFindByCategoryThenThrowException

    @Test
    void givenValidCategoryWhenFindByCategoryThenReturnCategoryCount() {
        // given - provided

        // when - execution
        // then - checking

        // when
        List<Order> orders = orderRepo.findByCategory("Laptops");

        // then
        assertThat(orders.size()).isEqualTo(2);
    }

    @Test
    void findByCategoryAndQuantity() {

    }

    @Test
    void getCategoryWiseCount() {

        List< Map<String, Integer> > categoryCountList = orderRepo.getCategoryWiseCount();

        assertThat(categoryCountList.size()).isEqualTo(2);

        log.info("Test: {}", categoryCountList.get(0));

        assertThatCollection(categoryCountList.get(0).values()).size().isEqualTo(2);
    }
}