package org.example.activity;

public class Point08 {
    static class Calculator {
        private double result;

        // Constructor to initialize the calculator with an initial value (optional)
        public Calculator(double initialValue) {
            this.result = initialValue;
        }

        // Method to add a value to the current result
        public Calculator add(double value) {
            result += value;
            System.out.println("Current result after addition: " + result);
            return this;
        }

        // Method to subtract a value from the current result
        public Calculator subtract(double value) {
            result -= value;
            System.out.println("Current result after subtraction: " + result);
            return this;
        }

        // Method to multiply the current result by a value
        public Calculator multiply(double value) {
            result *= value;
            System.out.println("Current result after multiplication: " + result);
            return this;
        }

        // Method to get the final result
        public double getResult() {
            return result;
        }
    }

    public static void main(String[] args) {
        // Create a calculator instance with an initial value
        Calculator calculator = new Calculator(20);

        // Perform a series of operations using method chaining
        calculator.add(4)
                .subtract(10)
                .multiply(2)
                .add(15);

        // Get the final result
        double finalResult = calculator.getResult();
        System.out.println("Final result: " + finalResult);
    }
}
