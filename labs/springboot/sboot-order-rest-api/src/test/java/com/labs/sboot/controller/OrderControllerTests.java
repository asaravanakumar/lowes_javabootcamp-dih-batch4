package com.labs.sboot.controller;

import com.labs.sboot.model.Order;
import com.labs.sboot.service.OrderService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrderControllerTests {

    @LocalServerPort
    private int port;

    @MockBean
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenValidOrder_WhenCreateOrder_ThenReturnSuccessMsg() {

        Order order1 = new Order("Lenovo ThinkPad", "Laptops", 10, 75000.0 );

        Mockito.when(orderService.create(Mockito.any())).thenReturn(100);

        given()
                .body(order1)
                .contentType(ContentType.JSON)
       .when()
                .post("/orders")
       .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .body(equalTo("{\"status\":\"Success\",\"message\":\"Order created successfully\"}"));
    }

    @Test
    void whenGetAllOrders_ThenReturnOrderList() {
        Order order1 = new Order("Lenovo ThinkPad", "Laptops", 10, 75000.0 );

        Mockito.when(orderService.viewAll()).thenReturn(List.of(order1));

//        Response response = given().when().get("/orders");
//
//        List<Order> orderList = response.jsonPath().getList("");
//
//        Assertions.assertThat(orderList.size()).isEqualTo(1);

        given()
        .when()
                .get("/orders")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("$", hasSize(1))
                .body("$", contains(
                        hasEntry("category", "Laptops")
                        ));
    }

    @Test
    void givenValidOrderId_WhenGetOrder_ThenReturnOrderDetails() {

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}