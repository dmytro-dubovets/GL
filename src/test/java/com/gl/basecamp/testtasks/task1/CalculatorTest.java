package com.gl.basecamp.testtasks.task1;

import com.gl.basecamp.tasks.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void verifyAdd() {
        double x = 5;
        double y = 6;
        double actualResult = 11;
        double expectedResult = calculator.add(x, y);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifySubtraction() {
        double x = 10;
        double y = 6;
        double actualResult = 4;
        double expectedResult = calculator.subtraction(x, y);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyMultiply() {
        double x = 5;
        double y = 6;
        double actualResult = 30;
        double expectedResult = calculator.multiply(x, y);
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyDivision() {
        double x = 15;
        double y = 3;
        double actualResult = 5;
        double expectedResult = calculator.division(x, y);
        Assertions.assertEquals(actualResult, expectedResult);
    }

}
