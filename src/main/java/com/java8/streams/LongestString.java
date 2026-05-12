package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Find longest string from list of strings
// Sort the characters in them
public class LongestString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "welcome", "to", "india", "firsttime");

        String longest = list.stream().max(Comparator.comparing(String::length)).orElse("");

        String sorted = longest.chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
        System.out.println("Longest sorted string is: " + sorted);

    }
}
