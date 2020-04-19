package org.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    private final Calculator calc = new Calculator();
    @Test
    public void test_Add() {
        assertEquals(7.0, calc.Add(2, 5), 1e-10);
        assertEquals(-2.0, calc.Add(2, -4), 1e-10);
        assertEquals(12.5, calc.Add(4, 8.5), 1e-10);
    }
    @Test
    public void test_Minus() {
        assertEquals(-4.0, calc.Minus(6, 10), 1e-10);
        assertEquals(10.0, calc.Minus(5, -5), 1e-10);
        assertEquals(4.0, calc.Minus(6, 2), 1e-10);
    }
    @Test
    public void test_Multiply() {
        assertEquals(-12.0, calc.Multiply(-3, 4), 1e-10);
        assertEquals(42.0, calc.Multiply(-6, -7), 1e-10);
        assertEquals(12.0, calc.Multiply(3, 4), 1e-10);
    }
    @Test
    public void test_Div() {
        assertEquals(6.5, calc.Div(-13, -2), 1e-10);
        assertEquals(4.0, calc.Div(16, 4), 1e-10);
        assertEquals(-7.0, calc.Div(28, -4), 1e-10);
    }
}
