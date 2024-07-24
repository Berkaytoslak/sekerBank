package com.example.sekerbank.service;

import com.example.sekerbank.client.Calculator;
import com.example.sekerbank.client.CalculatorSoap;
import org.springframework.stereotype.Service;

import java.net.URL;

@Service
public class CalculatorService {

    private final CalculatorSoap calculatorSoap;

    public CalculatorService() throws Exception {
        URL wsdlURL = new URL("http://www.dneonline.com/calculator.asmx?wsdl");
        Calculator service = new Calculator(wsdlURL);
        calculatorSoap = service.getCalculatorSoap();
    }

    public int add(int firstDigit, int secondDigit){
        return calculatorSoap.add(firstDigit, secondDigit);
    }

    public int subtract(int firstDigit, int secondDigit) {
        return calculatorSoap.subtract(firstDigit, secondDigit);
    }

    public int multiply(int firstDigit, int secondDigit) {
        return calculatorSoap.multiply(firstDigit, secondDigit);
    }

    public int divide(int firstDigit, int secondDigit) {
        if (secondDigit == 0){
            return 0; //
        }
        else return calculatorSoap.divide(firstDigit, secondDigit);
    }
}
