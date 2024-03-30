package com.picsartacademy.java.jenkins.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/")
    public Integer sum(@RequestParam Integer x, @RequestParam Integer y) {
        return calculatorService.sum(x, y);
    }
}
