package com.labs.java.collection;

import java.util.ArrayList;
import java.util.List;

public class OrderListMain {
    private static List orders = new ArrayList();

    public static void main(String[] args) {

        Order order1 = new Order(100,"iPhone 15", "SmartPhone", 10, 70000.0);
        Order order2 = new Order(101, "Sony OLED TV", "SmartTv", 5, 80000.0);

        // TODO: Create order
        create(order1);
        create(order2);

        // List Order
        list();

        // Update Order
        Order order3 = new Order(101, "Sony OLED TV", "SmartTv", 10, 80000.0);
        update(101, order3);

        list();

        // Delete Order
        delete(100);

        // View Order
        list();
    }

    private static void create(Order order) {
        orders.add(order);
    }

    private static void update(int id, Order order) {
        int index = orders.indexOf(order);

        orders.set(index, order);
    }

    private static void delete(int id) {
        Order orderToDelete = null;
        for (Object order : orders) {
            if (((Order) order).getId() == id) {
                orderToDelete = (Order) order;
            }
        }

        if (orderToDelete == null) {
            throw new RuntimeException("No order found for given id");
        }

            orders.remove(orderToDelete);

        }


        private static void list() {
            System.out.format("\n%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");
            for (Object item : orders) {
                Order order = (Order) item;
                System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
            }
    }
}
