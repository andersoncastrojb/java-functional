package org.example.activity;

import java.util.function.Predicate;

public class Point03 {
    static Predicate<Double> isPar = c -> c % 2 == 0;
    static Predicate<Double> isImPar = c -> c % 2 != 0;

    public static void main(String[] args) {
        System.out.println("Cube of 2 is imPar? R// " + isImPar.test( Point02.cube.apply(2) ) );
        System.out.println("Cube of 4 is par? R// " + isPar.test( Point02.cube.apply(4) ) );
    }
}
