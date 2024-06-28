package com.labs.java.concurrency;

public class ThreadSyncDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            ImportTask r = new ImportTask();
            Thread t = new Thread(r);
            t.setName(String.valueOf(i));
            t.start();
        }
    }
}
