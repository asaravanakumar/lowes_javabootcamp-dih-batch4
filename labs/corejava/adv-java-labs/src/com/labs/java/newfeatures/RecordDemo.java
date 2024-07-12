package com.labs.java.newfeatures;

public class RecordDemo {
    public static void main(String[] args) {
//        OrderSearch order1 = new OrderSearch(123, "SmartPhones", 25000.0);
//        System.out.println(order1);
//
//        OrderSearch order2 = new OrderSearch(123, "SmartPhones", 25000.0);
//
//        System.out.println(order1.equals(order2));


        OrderRecord record1 = new OrderRecord(123, "SmartTvs", 50000.0);
        System.out.println(record1);

        OrderRecord record2 = new OrderRecord(123, "SmartTvs");

        System.out.println(record1.id() + " " + record1.category() + " " + record1.price());
        System.out.println(record1.equals(record2));

       record2.showDetails();
    }
}
