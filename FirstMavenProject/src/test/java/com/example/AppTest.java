package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class AppTest {

    calculator calc = new calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    void testDivision() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calc.divide(10, 0)
        );
    }
}
