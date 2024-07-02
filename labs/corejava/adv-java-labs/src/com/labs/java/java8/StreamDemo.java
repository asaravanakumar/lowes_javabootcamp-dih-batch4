package com.labs.java.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        Stream<Integer> nos = Stream.of(100,300,200,100,250,200,350);

        Integer[] nos = new Integer[] {100,300,200,100,250,200,350}; // Stream source - Array

        List<Integer> nos1 = new ArrayList<>(Arrays.asList(nos)); // Stream source - collection

//        Stream<Integer> in = Arrays.stream(nos); // Creating Stream instance

//        Stream<Integer> in = nos1.stream(); // Creating Stream instance



//        Stream<Integer> out = in.filter(n -> n >= 200) // intermediate1 - [200,300]
//           .map(n -> n * n) // intermediate2 - [40000,90000]
//           .distinct() // intermediate3
//           .sorted(Comparator.comparing(Integer::intValue).reversed());// intermediate4  //(o1,o2) -> o2 - o1

        // Terminal Operations

//        out.forEach(System.out::println); // terminal
//        long count = out.count();

//        List<Integer> outList = out.collect(Collectors.toList());
//        System.out.println(outList);

//        Optional<Integer> max = out.max(Comparator.comparing(Integer::intValue));
//
//
//        System.out.println("Max: " + max.get());

//        System.out.println("Count: " + count);

//        IntStream in = IntStream.of(100,300,200,100,250,200,350); // Creating Int Stream

         IntStream in = nos1.stream()
                            .mapToInt(x -> x); // creates IntStream

         IntStream out = in.filter(n -> n >= 200) // intermediate1 - [200,300]
                .map(n -> n * n) // intermediate2 - [40000,90000]
                .distinct() // intermediate3
                .sorted(); // intermediate4  //(o1,o2) -> o2 - o1

        // Terminal Operations

//        System.out.println("Max: " + out.max().getAsInt());
//        System.out.println("Min: " + out.min().getAsInt());
//
//        System.out.println("Sum: " + out.sum());
//        System.out.println("Avg: " + out.average().getAsDouble());

        IntSummaryStatistics stat = out.summaryStatistics(); // terminal operation

        System.out.println("Min: " + stat.getMin());
        System.out.println("Max: " + stat.getMax());

        System.out.println("Sum: " + stat.getSum());
        System.out.println("Avg: " + stat.getAverage());

    }
}
