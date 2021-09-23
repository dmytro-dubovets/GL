package com.gl.basecamp.tasks.task1;

public class Calculator {

    private static final String PLUS_OPERATION = "+";

    private static final String MINUS_OPERATION = "-";

    private static final String MULTIPLICATION_OPERATION = "*";

    private static final String DIVISION_OPERATION = "/";

    public double calculateDependsTheOperation(String operation, double x, double y) {
        switch (operation) {
            case PLUS_OPERATION:
                return add(x, y);
            case MINUS_OPERATION:
                return subtraction(x, y);
            case MULTIPLICATION_OPERATION:
                return multiply(x, y);
            case DIVISION_OPERATION:
                return division(x, y);
            default:
                throw new IllegalArgumentException(String.format("Operation - '%s' must be one of: '+', '-', '*', '/'", operation));
        }
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return Math.round((x / y) * 100.0) / 100.0;
    }

}

