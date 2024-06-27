package com.labs.java.concurrency;

public class RunnableTaskMain {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

//        RunnableTask r1 = new RunnableTask();
//        Thread t1 = new Thread(r1);
        Thread t1 = new Thread(r);
        t1.setName("T1");
        t1.start();

//        t1.interrupt(); // interrupts the thread

//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        RunnableTask r2 = new RunnableTask();
        Thread t2 = new Thread(r);
        t2.setName("T2");
        t2.start();

//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        RunnableTask r3 = new RunnableTask();
        Thread t3 = new Thread(r);
        t3.setName("T3");
        t3.start();

//        try {
//            t3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}
