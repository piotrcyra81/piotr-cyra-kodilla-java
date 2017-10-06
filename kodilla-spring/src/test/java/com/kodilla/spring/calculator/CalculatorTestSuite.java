package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultOfAdd = calculator.add(4.5, 1.5);
        double resultOfSub = calculator.sub(4.0, 2.0);
        double resultOfMul = calculator.mul(5.0, 5.0);
        double resultOfDiv = calculator.div(6.0, 2.0);

        //Then
        //do nothing
    }
}