package com.example.sekerbank.controller;

import com.example.sekerbank.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int firsDigit, @RequestParam int secondDigit) {
        return calculatorService.add(firsDigit, secondDigit);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int firsDigit, @RequestParam int secondDigit) {
        return calculatorService.subtract(firsDigit, secondDigit);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int firsDigit, @RequestParam int secondDigit) {
        return calculatorService.multiply(firsDigit, secondDigit);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int firsDigit, @RequestParam int secondDigit) {
        return calculatorService.divide(firsDigit, secondDigit);
    }
}
