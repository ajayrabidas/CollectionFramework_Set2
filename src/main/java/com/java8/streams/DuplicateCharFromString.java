package com.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Print duplicate characters in a string
public class DuplicateCharFromString {
    public static void main(String[] args) {
        String input = "Hello Welcome to India".replaceAll("\\s+", "");

        Set<String> uniqueChars = new HashSet<>();

        Set<String> duplicates = Arrays.stream(input.split(""))
                .filter(ch -> !uniqueChars.add(ch))
                .collect(Collectors.toSet());

        System.out.println("Duplicate characters in the string: " + duplicates);
    }

}
