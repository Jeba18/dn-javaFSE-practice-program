package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 7);
        assertEquals(10, result);  // checks if 3 + 7 = 10
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(9, 4);
        assertEquals(5, result);  // checks if 9 - 4 = 5
    }
}
