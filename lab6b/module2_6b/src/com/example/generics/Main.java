package com.example.generics;

public class Main {

    public static void main(String[] args) {
        // Test with Integer
        Integer[] intArray = {2, 5, 3, 8, 1};
        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>();
        System.out.println("Integer Array: ");
        System.out.println("Min: " + intMinMax.min(intArray));
        System.out.println("Max: " + intMinMax.max(intArray));
        
        // Test with Float
        Float[] floatArray = {2.5f, 5.7f, 3.9f, 8.2f, 1.3f};
        ArrayMinMax<Float> floatMinMax = new ArrayMinMax<>();
        System.out.println("\nFloat Array: ");
        System.out.println("Min: " + floatMinMax.min(floatArray));
        System.out.println("Max: " + floatMinMax.max(floatArray));

        // Test with String
        String[] strArray = {"Apple", "Orange", "Banana", "Pear"};
        ArrayMinMax<String> strMinMax = new ArrayMinMax<>();
        System.out.println("\nString Array: ");
        System.out.println("Min: " + strMinMax.min(strArray));
        System.out.println("Max: " + strMinMax.max(strArray));

        // Test with Character
        Character[] charArray = {'A', 'Z', 'M', 'K'};
        ArrayMinMax<Character> charMinMax = new ArrayMinMax<>();
        System.out.println("\nCharacter Array: ");
        System.out.println("Min: " + charMinMax.min(charArray));
        System.out.println("Max: " + charMinMax.max(charArray));
    }
}
