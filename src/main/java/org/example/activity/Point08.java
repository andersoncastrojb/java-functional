package org.example.activity;

public class Point08 {
    static class Calculator {
        private double result;

        public Calculator(double initialValue) {
            this.result = initialValue;
        }

        public Calculator add(double value) {
            result += value;
            System.out.println("Current result after addition: " + result);
            return this;
        }

        public Calculator subtract(double value) {
            result -= value;
            System.out.println("Current result after subtraction: " + result);
            return this;
        }

        public Calculator multiply(double value) {
            result *= value;
            System.out.println("Current result after multiplication: " + result);
            return this;
        }

        public double getResult() {
            return result;
        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator(20);

        calculator.add(4)
                .subtract(10)
                .multiply(2)
                .add(15);

        double finalResult = calculator.getResult();
        System.out.println("Final result: " + finalResult);
    }
}
