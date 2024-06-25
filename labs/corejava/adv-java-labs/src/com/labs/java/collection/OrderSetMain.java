package com.labs.java.collection;

import java.util.HashSet;
import java.util.Set;

public class OrderSetMain {
    private static Set<Order> orders = new HashSet<>();

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
        System.out.println("Order created successfully");
    }

    private static void update(int id, Order order) {

        Order orderForUpdate = null;

        for(Order orderItem: orders) {
            if(orderItem.getId() == id) {
                orderForUpdate = (Order) orderItem;
                break;
            }
        }

        if (orderForUpdate == null) {
            throw new RuntimeException("No order found for given id");
        }

//        System.out.println(order.equals(orderForUpdate));
//        System.out.println(order.hashCode() + " " + orderForUpdate.hashCode());

        orders.remove(orderForUpdate);

        // TODO: Logic to update
        order.setId(id);
        System.out.println(orders.add(order));

        System.out.println("Order updated successfully");
    }

    private static void delete(int id) {
        Order orderToDelete = null;
        for (Order order : orders) {
            if (order.getId() == id) {
                orderToDelete = order;
            }
        }

        if (orderToDelete == null) {
            throw new RuntimeException("No order found for given id");
        }

        orders.remove(orderToDelete);

        System.out.println("Order deleted successfully");
    }


    private static void list() {
        System.out.format("%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");
        for (Object item : orders) {
            Order order = (Order) item;
            System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
        }
    }

}
