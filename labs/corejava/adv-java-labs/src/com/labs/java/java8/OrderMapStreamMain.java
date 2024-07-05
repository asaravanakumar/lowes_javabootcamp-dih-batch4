package com.labs.java.java8;

import com.labs.java.collection.Order;
import com.labs.java.collection.OrderMapMain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OrderMapStreamMain {

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

        showTotalAmountByCategory(orders);

        showCategoriesInDescOrderWhoseAvgAmountGreaterThan75k(orders);
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

        // TODO: Implement with Stream API

        orders.values()
                .stream()
                .sorted(Comparator.comparing(Order::getCategory))
                .collect(Collectors.groupingBy(Order::getCategory, TreeMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " " + v));
    }

    private static void showTotalAmountByCategory(Map<Integer,Order> orders) {
        System.out.println("Category wise Total Amount:");

        // TODO: Logic to compute category wise total amount
        orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, Collectors.summingDouble(OrderMapStreamMain::getTotalAmount)))
                .forEach((k,v) -> System.out.println(k + " " + v));
    }

    private static void showCategoriesInDescOrderWhoseAvgAmountGreaterThan75k(Map<Integer,Order> orders) {
        System.out.println("List of categories whose avg amount greater than 75k");

        // TODO: Logic to list the categories whose avg amount greater than 75k
        orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, Collectors.averagingDouble(Order::getPrice)))
//                .forEach((k,v) -> System.out.println(k + " " + v));
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 75000.0)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static double getTotalAmount(Order order) {
        return order.getQuantity() * order.getPrice();
    }
}
