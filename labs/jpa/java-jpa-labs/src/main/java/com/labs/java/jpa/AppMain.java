package com.labs.java.jpa;

import com.labs.java.jpa.model.Order;
import com.labs.java.jpa.service.OrderService;
import com.labs.java.jpa.service.OrderServiceImpl;

import java.util.Collection;

public class AppMain {
    private static OrderService service = new OrderServiceImpl();

    public static void main(String[] args) {

        // TODO: List Orders
        listOrders();

        // TODO: Create Order
        Order order1 = new Order("iPhone 15", "SmartPhone", 10, 70000.0);

        int id = service.create(order1);
        System.out.printf("Order Created successfully - %d \n", id);

        listOrders();

        // TODO: View Order
//        Order order = service.view(id);
//        System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());

        // TODO: Update Order
        Order order2 = new Order("Sony OLED TV", "SmartTv", 5, 80000.0);
        boolean flag = service.update(id, order2);
        System.out.printf((flag ? "Order updated successfully" : "Updation falied") + "- %d \n" , id);

        listOrders();

        // TODO: Delete Order
        service.delete(id);
        System.out.printf("Order deleted successfully - %d \n", id);

        listOrders();
    }

    private static void listOrders() {
        Collection<Order> orders = service.viewAll();

        System.out.format("%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");

        if(orders == null || orders.size() < 1) {
            System.out.println("No orders found");
            return;
        }

        for (Order order : orders) {
            System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
        }
    }
}
