package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
        assertEquals(10, calculator.add(new int[]{1, 2, 3, 4}));
        assertEquals(33, calculator.add(4, 1, 3, 4, 6, 7, 8));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(4, 0));
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divideInt(5, 2));
        assertEquals(1.67, calculator.divideDouble(5, 3));
    }
}