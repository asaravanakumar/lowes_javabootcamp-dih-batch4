package com.labs.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderMapMain {

    private static Map<Integer, Order> orders = new HashMap<>();

    public static void main(String[] args) {
        Order order1 = new Order(100,"iPhone 15", "SmartPhone", 10, 70000.0);
        Order order2 = new Order(101, "Sony OLED TV", "SmartTv", 5, 80000.0);
        Order order3 = new Order(102, "Samsung Galazy S24", "SmartPhone", 5, 75000.0);
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

        // Update Order
//        Order order6 = new Order(101, "Sony OLED TV", "SmartTv", 10, 80000.0);
//        update(101, order6);
//
//        list();
//
//        // Delete Order
//        delete(100);
//
//        // View Order
//        list();

        //Show no of orders by category

        showOrderCountByCategory(orders);
        // SmartTv 2
        // SmartPhone 3

        // Show total order amount sum(qty*price) by category
        // SmartTv 670000
        // SmartPhone 1575000
    }
    private static void create(Order order) {
        orders.put(order.getId(), order);
        System.out.println("Order created successfully");
    }

    private static void update(int id, Order order) {

        Order orderForUpdate = orders.get(id);

        if (orderForUpdate == null) {
            throw new RuntimeException("No order found for given id");
        }

        // TODO: Logic to update
        orders.put(id, order);

        System.out.println("Order updated successfully");
    }

    private static void delete(int id) {
        Order orderToDelete = orders.get(id);

        if (orderToDelete == null) {
            throw new RuntimeException("No order found for given id");
        }

        orders.remove(id);

        System.out.println("Order deleted successfully");
    }


    private static void list() {
        System.out.format("%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");
        for (Order order : orders.values()) {
            System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
        }
    }

    private static void showOrderCountByCategory(Map<Integer,Order> orders) {
        System.out.println("Category wise Order Count:");

        Map<String, Integer> orderCountByCat = new TreeMap<>();

        for(Order order: orders.values()) {
            if(orderCountByCat.containsKey(order.getCategory())) {
                orderCountByCat.put(order.getCategory(), orderCountByCat.get(order.getCategory()) + 1);
            }else {
                orderCountByCat.put(order.getCategory(), 1);
            }
        }

        System.out.println(orderCountByCat);

        for(Map.Entry<String, Integer> entry: orderCountByCat.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
