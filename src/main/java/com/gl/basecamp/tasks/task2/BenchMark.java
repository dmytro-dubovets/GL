package com.gl.basecamp.tasks.task2;

import com.gl.basecamp.tasks.task1.Calculator;

import static com.gl.basecamp.tasks.task2.Operations.*;

public class BenchMark {

    public long measureExecutionTimeForMethod(Calculator calculator, String operation, double x, double y) {
        long startTime = System.currentTimeMillis();
        double result = getValueBasedOnOperation(calculator, operation, x, y);
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long measureExecutionTimeForMethodNTimes(Calculator calculator, String operation, double x, double y, int executeTimes) {
        long startTime = System.currentTimeMillis();
        double result = 0;
        for (int i = 0; i < executeTimes; i++) {
            result = getValueBasedOnOperation(calculator, operation, x, y);
        }
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private double getValueBasedOnOperation(Calculator calculator, String operation, double x, double y) {
        if (operation.equals(ADD_OPERATION.getValue())) {
            return calculator.add(x, y);
        } else if (operation.equals(SUBTRACTION_OPERATION.getValue())) {
            return calculator.subtraction(x, y);
        } else if (operation.equals(MULTIPLY_OPERATION.getValue())) {
            return calculator.multiply(x, y);
        } else if (operation.equals(DIVISION_OPERATION.getValue())) {
            return calculator.division(x, y);
        } else {
            throw new IllegalArgumentException(String.format("Operation - '%s' must be one of: add, subtraction, multiply, division", operation));
        }
    }

}
