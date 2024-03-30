package com.picsartacademy.java.jenkins.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer sum(Integer x, Integer y) {
        if (x == null && y == null) {
            return 0;
        }
        if (x == null) {
            return y;
        }
        if (y == null) {

            return x;
        }


        return x + y;
    }
}
