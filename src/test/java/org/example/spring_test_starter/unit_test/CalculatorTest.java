package org.example.spring_test_starter.unit_test;

import org.example.spring_test_starter.utility.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("1. Before All");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("2. Before Each");
    }

    @Test
    @DisplayName("Addition Test")
    void test1() {
        System.out.println("3. Test 1");
    }

    @Test
    @DisplayName("Subtraction Test")
    void test2() {
        System.out.println("3. Test 2");
    }

    @AfterEach
    void afterEach() {
        System.out.println("4. After Each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("5. After All");
    }

}