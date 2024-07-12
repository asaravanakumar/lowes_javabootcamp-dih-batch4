package com.labs.java;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    private static Calculator calc = null;
    @BeforeAll
    public static void init() {
        calc = new Calculator();
        System.out.println("Before All Called...");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("After All Called...");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each Called...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each called");
    }

    @Test
    public void whenTwoArgumentsArePositiveThenReturnPositiveValue() {
        // TODO: TEST ADD FUNCTIONALITY

        int actual = calc.add(20,30);
        int expected = 50;

//        if(actual == expected) {
//            System.out.println("Passed");
//        } else {
//            System.out.println("Failed");
//            Assertions.fail();
//        }

        assertEquals(expected, actual, "Expected is different from actual");
    }

    @Test
    public void whenTwoArgumentsAreNegativeThenReturnNegativeValue() {
        // TODO: TEST ADD FUNCTIONALITY
//        Calculator calc = new Calculator();
        int actual = calc.add(-20,-30);
        int expected = -50;

        assertEquals(expected, actual, "Expected is different from actual");
    }

    @Test
    public void testComputeCircleRadius() {
//        fail();
//        Calculator calc = new Calculator();
        double area = calc.computeCircleRadius(10);

        double expected = 314.1592653589793;

        assertEquals(expected, area);
    }
}
