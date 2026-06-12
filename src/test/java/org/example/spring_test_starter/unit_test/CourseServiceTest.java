package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.utility.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseServiceTest {

    Calculator calculator = new Calculator();

    @BeforeAll
    public static void testBeforeAll()
    {
        System.out.println("inside testBeforeAll");
    }


    @BeforeEach
    public void testBeforeEach()
    {
        System.out.println("inside testBeforeEach");
    }

    @AfterEach
    public void testAfterEach()
    {
        System.out.println("inside testAfterEach");
    }

    @Test
    public void testDivide()
    {
        System.out.println("inside testDivide");
        assertEquals(5, calculator.divide(10,2));

    }

    @Test
    public void testMultiply()
    {
        System.out.println("inside testMultiply");
        assertEquals(20, calculator.multiply(10,2));
    }

    @Test
    public void testEven()
    {
        System.out.println("inside testEven");
        assertTrue(calculator.isEven(10));
    }

    @AfterAll
    public static void testAfterAll()
    {
        System.out.println("inside testAfterAll");
    }

}
