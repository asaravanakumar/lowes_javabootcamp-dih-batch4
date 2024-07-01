package com.labs.java.concurrency;

public class ImportTask implements Runnable {

    // shared
    private static int counter = 0;

    // shared
    public void importData()  { // T1

        synchronized (this) { // acquires lock
            counter = counter + 2; // T1
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
            counter = counter - 1;
        } // release lock

        System.out.println(Thread.currentThread().getName() + " No of orders imported - " + counter);
    }

    @Override
    public void run() {
        // TODO: Imports order data
//        System.out.println("Import Thread " + Thread.currentThread().getName());
        importData();
        //
    }
}
