package com.gl.basecamp.tasks.task2;

import com.gl.basecamp.tasks.task1.Calculator;

import static com.gl.basecamp.tasks.task2.Operations.*;

public class BenchMarkRunner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        BenchMark benchMark = new BenchMark();
        double x = 5;
        double y = 6;
        String operation = ADD_OPERATION.getValue();
        long executionTime = benchMark.measureExecutionTimeForMethodNTimes(calculator, operation, x, y, 1000);
        System.out.println("Execution time for add method: " + executionTime + " milli seconds");
    }
}
