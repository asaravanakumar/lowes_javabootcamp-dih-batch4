package com.labs.java.concurrency;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getState());
        System.out.println("Hello Thread!!!");

        Task t1 = new Task();
        t1.setName("T1");
        t1.start();

        Task t2 = new Task();
        t2.setName("T2");
        t2.start();

        Task t3 = new Task();
        t3.setName("T3");
        t3.start();

        System.out.println("Sleeping...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Exiting...Bye!!!");
    }
}
