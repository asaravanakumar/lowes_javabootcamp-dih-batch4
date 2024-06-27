package com.labs.java.generic;

import java.util.ArrayList;
import java.util.List;
/*
* PECS - Producer Extends Consumer Super
 */
public class GenericWildcardDemo {

    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<>(List.of(199,499,399,299));
        printItems(nos);
        printItems1(nos);
        addItemInt(nos);
        printItems2(nos);

        System.out.println();

        List<String> strs = new ArrayList<>(List.of("Java", "Python", ".Net"));
//        printItems(strs); // Compilation Error - Incompatible Type
        printItems1(strs);
        addItemStr(strs);
        printItems2(strs);

    }

    // Wildcards
    // ? - unbounded
    // ? extends - upper bounded
    // ? super - lower bounded

    // Contra-Variant

    // In-Variant
    public static void printItems(List<Integer> nos) {
        System.out.println("PrintItems method called");

        for(Object obj: nos) {
            System.out.println(obj);
        }
        System.out.println();
    }

    // Co-Variant - upper bounded wildcard
    public static void printItems1(List<? extends Comparable> nos) {
//        nos.add(200);
        System.out.println("PrintItems1 method called");

        for(Object obj: nos) {
            System.out.println(obj);
        }
        System.out.println();

    }

    // Contra-Variant - lower bounded wildcard
    public static void addItemInt(List<? super Integer> nos) {
        nos.add(200);
    }

    public static void addItemStr(List<? super String> nos) {
        nos.add("Updated");
    }

    // Unbounded
    public static void printItems2(List<?> nos) {
        System.out.println("PrintItems2 method called");

        for(Object obj: nos) {
            System.out.println(obj);
        }
        System.out.println();
    }

}
