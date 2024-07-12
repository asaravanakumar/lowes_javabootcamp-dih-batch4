package com.labs.java.newfeatures;

import com.labs.java.collection.Order;

import java.io.Serializable;

public record OrderRecord(int id, String category, double price) implements Serializable, Cloneable {


    // Canonical Constructor
    public OrderRecord(int id, String category, double price) {
        System.out.println("Canonical Construtor");
        this.id = id;
        this.category = category;
        this.price = price;
    }


    // Compact Constructor
//    public OrderRecord {
//        System.out.println("Compact Construtor");
//    }

    public OrderRecord() {
        this(0,null,0.0);
    }

    public OrderRecord(int id) {
        this(id,null,0.0);
    }

    public OrderRecord(int id, String category) {
        this(id,category,0.0);
        System.out.println("Called overloaded constructor");
    }

    public void showDetails() {
        System.out.println(this.toString());
    }
}
