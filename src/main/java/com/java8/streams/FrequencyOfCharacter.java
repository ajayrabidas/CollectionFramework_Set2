package com.java8.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find frequency of each character
public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "HelloIndia";

        Map<Character, Long> feqMap = str.chars() // Converts String into IntStream ASCII values of characters.
                .mapToObj(c -> (char) c) // Converts ASCII/int back to Character.
                .collect(Collectors.groupingBy( // Groups same characters together.
                        Function.identity(),
                        Collectors.counting())); // Counts occurrences.
        System.out.println(feqMap);
    }

}
