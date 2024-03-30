package com.picsartacademy.java.jenkins.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    @Test
    void sum() {
        Integer sum = calculatorService.sum(5, 5);
        assertEquals(10, sum);
    }
    @Test
    void sum_one_arg_is_null() {
        Integer sum = calculatorService.sum(5, null);
        assertEquals(5, sum);
    }

    @Test
    void sum_two_arg_are_null_return_zero() {
        Integer sum = calculatorService.sum(null, null);
        assertEquals(0, sum);
    }

}