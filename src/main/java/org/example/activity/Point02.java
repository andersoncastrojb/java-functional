package org.example.activity;

import java.util.function.Function;

public class Point02 {

    static Function<Integer, Double> cube = new Function<Integer, Double>() {
        @Override
        public Double apply(Integer integer) {
            return Math.pow(integer, 3);
        }
    };

    public static void main(String[] args) {
        System.out.println("Cube of 2 is: " + cube.apply(2));
        System.out.println("Cube of 4 is: " + cube.apply(4));
    }
}
