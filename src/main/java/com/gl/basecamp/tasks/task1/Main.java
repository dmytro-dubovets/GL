package com.gl.basecamp.tasks.task1;

import java.util.Scanner;

public class Main {

    private static double verifyTheInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator accept only numbers and the numbers must be > 0");
        System.out.println("Enter the first number: ");
        double x = verifyTheInput(scanner.next());
        System.out.println("Enter the second number: ");
        double y = verifyTheInput(scanner.next());
        System.out.println("Enter one of operation: '+', '-', '*', '/'");
        String operation = scanner.next();
        double result = calculator.calculateDependsTheOperation(operation, x, y);
        System.out.println("The result is: " + result);
    }
}
