package org.example.activity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Point07 {

    static class DatePrinter {
        private DatePrinter() {}
        public static void printFormattedDate(LocalDate date) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'del' yyyy");

            String formattedDate = date.format(formatter);
            System.out.println("The date is " + formattedDate + ".");
        }
    }

    public static void main(String[] args) {

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 8, 16),
                LocalDate.of(2024, 2, 17),
                LocalDate.of(2022, 11, 12)
        );
        dates.forEach(DatePrinter::printFormattedDate);
    }
}
