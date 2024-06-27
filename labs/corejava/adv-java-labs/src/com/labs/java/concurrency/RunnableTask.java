package com.labs.java.concurrency;

public class RunnableTask implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
