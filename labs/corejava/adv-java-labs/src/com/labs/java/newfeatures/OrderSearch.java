package com.labs.java.newfeatures;

import java.util.Objects;

/*
* Immutable data capture classes
 */
public class OrderSearch {
    private int id;
    private String category;
    private double price;

    public OrderSearch() {

    }

    public OrderSearch(int id, String category, double price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderSearch that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderSearch{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}