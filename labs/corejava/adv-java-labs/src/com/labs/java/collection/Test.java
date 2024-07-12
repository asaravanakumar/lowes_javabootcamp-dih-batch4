package com.labs.java.collection;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> skills = Stream.of("C", "C++", "Java", " ", "JavaScript", "", "C#");

        skills.dropWhile(item -> !item.isEmpty())
                .forEach(System.out::println);
    }
}