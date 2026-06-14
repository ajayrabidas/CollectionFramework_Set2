package com.java8.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find first repeated character in a string
public class FirstRepeatedCharInString {
    public static void main(String[] args) {
        String input = "Hello Welcome to India".replaceAll("\\s+", "");

        Map<String, Long> charCountMap = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println("First repeating character: " + firstRepeatedChar);

    }

}