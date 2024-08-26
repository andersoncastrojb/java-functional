package org.example.activity;

import java.util.Optional;
import java.util.stream.Stream;

public class Point09 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Pepe", "Maria", "Carlos", "Pepe", "Ana", "Carlos");
        Stream<String> filteredNames = filterNames(names, "Pepe");
        printFilteredNames(filteredNames);
    }

    // Filtering names based on the given parameter using Stream
    public static Stream<String> filterNames(Stream<String> names, String filter) {
        return names.filter(name -> name.equals(filter));
    }

    // Print the filtered names using Optional and Stream
    public static void printFilteredNames(Stream<String> filteredNames) {
        Optional.ofNullable(filteredNames)
                .orElseGet(Stream::empty) // Use an empty stream if the filtered stream is null
                .forEach(System.out::println); // Print each element
    }
}
