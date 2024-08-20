package org.example.activity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Point05 {

    public static void main(String[] args) {
        BinaryOperator<BigDecimal> divisionOfTwoNumbers = (x, y) -> x.divide(y, RoundingMode.HALF_UP);
        BigDecimal number01 = new BigDecimal("123.456");
        BigDecimal number02 = new BigDecimal("789.123");
        
        System.out.println("Division between " + number01 + " and " + number02 + " is: " +
                divisionOfTwoNumbers.apply(number01, number02));
    }
}
