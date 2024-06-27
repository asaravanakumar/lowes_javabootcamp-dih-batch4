package com.labs.java.io;

import com.labs.java.collection.Order;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderImpExpMain {
    private static Map<Integer, Order> orders = new HashMap<>();

    public static void main(String[] args) {

        list();

        importOrderData();

        list();

        exportOrderData();

    }

    private static void create(Order order) {
        orders.put(order.getId(), order);
        System.out.println("Order created successfully");
    }

    private static void list() {
        System.out.format("%5s %20s %20s %15s %10s\n", "ID", "Description", "Category", "Quantity", "Price");
        for (Order order : orders.values()) {
            System.out.format("%5s %20s %20s %15s %10s\n", order.getId(), order.getDescription(), order.getCategory(), order.getQuantity(), order.getPrice());
        }
    }

    // loads order data from file
    private static void importOrderData() {
        System.out.println("Importing order data...");
        int impCounter = 0;
        try (FileReader reader = new FileReader("./input/orders.txt");
             Scanner in = new Scanner(reader); ) {
           // TODO: LOGIC TO IMPORT ORDER DATA
            while(in.hasNextLine()) {

                String orderStr = in.nextLine();
//                System.out.println(orderStr);

                // TODO: create order object
                //100,iPhone 15,SmartPhone,10,70000.0
                String[] fields = orderStr.split(",");
                int id = Integer.parseInt(fields[0]);
                String desc = fields[1];
                String category = fields[2];
                int qty = Integer.parseInt(fields[3]);
                double price = Double.parseDouble(fields[4]);

                Order order = new Order(id, desc, category, qty, price);
                // TODO: add into orders map

                create(order);
                impCounter++;

            }
        }catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(impCounter + " orders imported successfully");
    }

    // exports order data to file
    private static void exportOrderData() {

        System.out.println("Exporting order data...");
        int expCounter = 0;
        try (FileWriter writer = new FileWriter("./output/orders.txt");) {
            // TODO: LOGIC TO EXPORT ORDER DATA
            for(Order order: orders.values()) {
                // TODO: create order detail delimited by comma from order object
                StringBuilder orderStr = new StringBuilder();
                orderStr.append(order.getId()).append(",")
                        .append(order.getDescription()).append(",")
                        .append(order.getCategory()).append(",")
                        .append(order.getQuantity()).append(",")
                        .append(order.getPrice()).append("\n");

                // TODO: write into file
                writer.write(orderStr.toString());
                expCounter++;
            }
        }catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(expCounter + " orders exported successfully");
    }
}
