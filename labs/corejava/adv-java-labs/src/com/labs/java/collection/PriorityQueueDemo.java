package com.labs.java.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        Comparator<String> SORT_DESC = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o2 + " " + o1 + " " + o2.compareTo(o1));
                return o1.compareTo(o2);
            }
        };

//        [Java, Python, C++, Django]
//
//        Python Java C++ Django



//        Queue<String> pq = new LinkedList<>();
        Queue<String> pq = new PriorityQueue<>(SORT_DESC);
        pq.offer("Java");
        pq.offer("Python");
        pq.offer("Javascript");
        pq.offer("Django");

        System.out.println(pq);
    }
}
