package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleCalculatorTest {
    private final SimpleCalc calculator = new SimpleCalc();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    // Five more tests that vary the inputs or methods to ensure full coverage
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    public void testSubtractToZero() {
        assertEquals(0, calculator.subtract(3, 3));
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-2, calculator.divide(6, -3));
    }

    @Test
    public void testMultiplyNegatives() {
        assertEquals(6, calculator.multiply(-2, -3));
    }
}

    
