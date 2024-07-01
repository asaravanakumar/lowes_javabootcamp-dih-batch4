package com.labs.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        // Creates Fixed Size Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(3);

        // Creates Thread Pool with one Thread
//        ExecutorService es = Executors.newSingleThreadExecutor();

        RunnableTask t1 = new RunnableTask();
        es.submit(t1); // Submits the task to the Thread Pool

        //RunnableTask t1 = new RunnableTask();
//        Future f = es.submit(t1); // Returns Future handle to track the task submitted
//        Thread.sleep(1000);
//        System.out.println(f.isDone());

        // Creates Dynamic size Thread Pool
//        ExecutorService es = Executors.newCachedThreadPool();
//
//
//        for(int i = 0; i < 5; i++) {
//            RunnableTask t1 = new RunnableTask();
//            if(i % 2 == 0) {
//                Thread.sleep(5000);
//            }
//            es.submit(t1);
//        }

        es.shutdown();
    }
}
