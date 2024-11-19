package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print the original list
        System.out.println("Original list: " + numbers);

        // Stream pipeline to filter even numbers, double them, and collect into a list
        List<Integer> doubledEvenNumbers = numbers.stream()
                                                  .filter(n -> n % 2 == 0)  // Filter even numbers
                                                  .map(n -> n * 2)          // Double each number
                                                  .collect(Collectors.toList()); // Collect to list

        // Print the filtered and transformed list
        System.out.println("Doubled even numbers: " + doubledEvenNumbers);
    }
}
