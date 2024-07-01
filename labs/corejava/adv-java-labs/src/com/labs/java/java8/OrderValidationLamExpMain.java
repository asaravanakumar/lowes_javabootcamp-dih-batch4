package com.labs.java.java8;

import com.labs.java.collection.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OrderValidationLamExpMain {
    private static Map<Integer, Order> orders = new HashMap<>();

    public static void main(String[] args) {
        Order order1 = new Order(100,"iPhone 15", "", 10, 70000.0);
        Order order2 = new Order(101, "Sony OLED TV", "SmartTv", 5, 80000.0);
        Order order3 = new Order(102, "Samsung Galazy S24", "SmartPhone", -5, 75000.0);
        Order order4 = new Order(103, "OnePlus Nord", "SmartPhone", 10, 50000.0);
        Order order5 = new Order(104, "Samsung OLED TV", "SmartTv", 3, 90000.0);
        Order order7 = new Order(105, "Lenovo Thinkpad", "Laptop", 3, 90000.0);



        // TODO: Create order
        create(order1);
        create(order2);
        create(order3);
        create(order4);
        create(order5);
        create(order7);


        // List Order
        list();
    }

    private static void create(Order order) {
        //TODO: Validate Order
        Predicate<Order> condition = ord -> { return ord.getCategory() != null && !ord.getCategory().isBlank() && ord.getQuantity() > 0; };
        boolean flag = validateOrder(condition, order);

        if(flag) {
            orders.put(order.getId(), order);
            System.out.println("Order created successfully");
        } else {
            Consumer<String> handler = msg -> System.out.println(msg);
            handleErrors(handler, "Order Validation Failed");
        }
    }

    private static void update(int id, Order order) {

        // Lambda Expression assigned into Functional Interface type and passed to function
        Predicate<Order> condition = ord -> { return id > 0 && ord.getCategory() != null && !ord.getCategory().isBlank() && ord.getQuantity() > 0; };
//        boolean flag = validateOrder(condition, order);

        // Passing Lambda Expression as argument
//        boolean flag = validateOrder(ord -> { return id > 0 && ord.getCategory() != null && !ord.getCategory().isBlank() && ord.getQuantity() > 0;}, order);

        // Method Reference example
        boolean flag = validateOrder(OrderValidationLamExpMain::performValidation, order);

        if(!flag) {
            System.out.println("Order updation failed");
            return;
        }

        Order orderForUpdate = orders.get(id);

        if (orderForUpdate == null) {
            throw new RuntimeException("No order found for given id");
        }

        // TODO: Logic to update
        orders.put(id, order);

        System.out.println("Order updated successfully");
    }

    private static boolean performValidation(Order ord) {
        return ord.getCategory() != null && !ord.getCategory().isBlank() && ord.getQuantity() > 0;
    }

    private static boolean validateOrder(Predicate<Order> condition, Order order) {
        return condition.test(order);
    }

    private static void handleErrors(Consumer<String> handler, String message) {
        handler.accept(message);
    }

    private static void list() {
        System.out.format("%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");
        for (Order order : orders.values()) {
            System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
        }
    }

//    private static Predicate<Order> getValidationRules() {
//        return (Order ord) -> {return ord.getCategory() != null && !ord.getCategory().isBlank() && ord.getQuantity() > 0;};
//    }
}
