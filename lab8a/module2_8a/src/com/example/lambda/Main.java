package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the original list
        System.out.println("Original list: " + fruits);

        // Sort the list in descending order using a lambda expression
        fruits.sort((s1, s2) -> s2.compareTo(s1));

        // Alternatively, using method reference for reverse order sorting
        // fruits.sort(Comparator.reverseOrder());

        // Print the sorted list
        System.out.println("Sorted list in descending order: " + fruits);
    }
}
