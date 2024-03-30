package com.picsartacademy.java.jenkins.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ITestCalcController {

    @Autowired
    CalcController calcController;

    @Test
    void test() {
        Integer sum = calcController.sum(5, 5);
        assertEquals(10, sum);
    }

    @Test
    void sum_one_arg_is_null() {
        Integer sum = calcController.sum(5, null);
        assertEquals(5, sum);
    }
}
