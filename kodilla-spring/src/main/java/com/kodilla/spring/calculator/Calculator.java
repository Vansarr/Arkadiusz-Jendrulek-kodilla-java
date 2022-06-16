package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    Display display;

    double add(double a, double b){
        double sum;
        sum = a + b;
        display.displayValue(sum);
        return sum;
    }

    double sub(double a, double b){
        double dif;
        dif = a - b;
        display.displayValue(dif);
        return dif;
    }

    double mul(double a, double b){
        double prod;
        prod = a * b;
        display.displayValue(prod);
        return prod;
    }

    double div(double a, double b){
        double quot;
        quot = a / b;
        display.displayValue(quot);
        return quot;
    }
}
