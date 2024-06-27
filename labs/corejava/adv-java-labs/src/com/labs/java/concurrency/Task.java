package com.labs.java.concurrency;

public class Task extends Thread {
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getState());
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
//        System.out.println("Custom Task Thread!!!");
    }
}
