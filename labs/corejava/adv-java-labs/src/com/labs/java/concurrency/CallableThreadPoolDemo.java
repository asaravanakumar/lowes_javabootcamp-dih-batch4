package com.labs.java.concurrency;

import java.util.concurrent.*;

public class CallableThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        CallableTask c1 = new CallableTask();

        Future<String> f = es.submit(c1);

//        while(!f.isDone()) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Waiting....");
//        }

        try {
            String res = f.get(); // blocked till task completes
            System.out.println(res);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
