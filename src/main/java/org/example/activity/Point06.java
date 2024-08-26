package org.example.activity;

import java.time.LocalDate;
import java.time.Period;

@FunctionalInterface
interface AgeValidator {
    String validate(String name, int age, LocalDate birthDate);
}

public class Point06 {

    public static void main(String[] args) {

        AgeValidator ageValidator = (name, age, birthDate) -> {

            int calculatedAge = Period.between(birthDate, LocalDate.now()).getYears();

            if (calculatedAge == age) {
                return "The birth date of " + name + " matches the entered age.";
            } else {
                return "The birth date of " + name + " does not match the entered age.";
            }
        };

        String message = ageValidator.validate("Pepe", 25, LocalDate.of(2000, 2, 16));
        System.out.println(message);
    }
}
