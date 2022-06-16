package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        //When
        double sum = calculator.add(2, 2);
        //Then
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void testSub() {
        //Given
        //When
        double dif = calculator.sub(4, 2);
        //Then
        Assertions.assertEquals(2, dif);
    }

    @Test
    public void testMul() {
        //Given
        //When
        double prod = calculator.mul(3, 3);
        //Then
        Assertions.assertEquals(9, prod);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        double quo = calculator.div(9, 3);
        //Then
        Assertions.assertEquals(3, quo);
    }

}
