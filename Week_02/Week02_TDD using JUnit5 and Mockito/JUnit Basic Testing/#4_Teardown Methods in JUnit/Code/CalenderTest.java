package com.jona.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator(); // Arrange
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        calc = null;
        System.out.println("After each test");
    }

    @Test
    void testAddition() {
        int result = calc.add(2, 3); // Act
        assertEquals(5, result);     // Assert
    }

    @Test
    void testMultiplication() {
        int result = calc.multiply(4, 5); // Act
        assertEquals(20, result);        // Assert
    }
}
