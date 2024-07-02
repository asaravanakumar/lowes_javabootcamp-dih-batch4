package com.labs.java.java8;

import com.labs.java.collection.Order;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        Order order = getOrder(100);
//        if(order == null) {
//            order = new Order();
//        }

        Optional<Order> orderOp = getOrder1(100);
//        Order order = null;
//        if (orderOp.isPresent()) {
//            order = orderOp.get();
//         } else {
//            order = new Order();
//        }

//        Order order = orderOp.orElse(new Order());

//        Order order = orderOp.orElseThrow(() -> new RuntimeException("No order found"));

        Order order = orderOp.orElseThrow(RuntimeException::new);


        System.out.println(order.getId() + " " + order.getCategory() + " " + order.getDescription());

    }

    public static Order getOrder(int id) {
        //TODO: Fetch order obj for given id
        return null;
//        return new Order();
    }

    public static Optional<Order> getOrder1(int id) {
        Order order = new Order();
        order.setId(100);
        order.setCategory("SmartPhones");
//        order.setDescription("iPhone 16");
        return Optional.empty();
//        return Optional.of(order);
    }
}
