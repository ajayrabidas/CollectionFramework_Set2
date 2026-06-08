package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the most repeated element in an array
public class MostRepeatedElementInArray {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCount = listOfStrings.stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> mostFrequentElement = elementCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Most frequent element: " + mostFrequentElement.getKey() + " : " + mostFrequentElement.getValue());

    }
}
