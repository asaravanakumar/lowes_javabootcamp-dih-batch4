package com.labs.sboot.service;

import com.labs.sboot.model.Order;
import com.labs.sboot.repo.OrderRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class OrderServiceRepositoryImplTests {

    @Autowired
    private OrderService orderService;

    @MockBean
    private OrderRepository orderRepo;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenValidOrderDetailsWhenCreateOrderThenReturnOrderId() {
        // given
        Order order1 = new Order("Lenovo ThinkPad", "Laptops", 10, 75000.0 );

        order1.setId(100);
        Mockito.when(orderRepo.save(Mockito.any())).thenReturn(order1);

        //when
        int id = orderService.create(order1);

        //then
        assertThat(id).isNotNegative();
        assertThat(id).isEqualTo(100);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void givenValidOrderIdWhenViewOrderThenReturnOrderDetails() {
    }

    @Test
    void whenViewAllOrdersThenReturnOrderDetailList() {

    }

    @Test
    void getCategoryWiseCount() {
    }
}