package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.utility.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorMethodTest
{

    Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    void shouldMultiplyNumbers() {

        int result = calculator.multiply(5, 6);

        assertEquals(30, result);
    }

    @Test
    void shouldCheckEvenNumber() {

        assertTrue(calculator.isEven(10));
        assertFalse(calculator.isEven(11));
    }

    @Test
    void shouldDivideNumbers() {

        int result = calculator.divide(10, 10);

        assertEquals(1, result);
    }

    @Test
    void shouldThrowException() {

        Calculator calculator = new Calculator();

        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> calculator.divide(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

}
