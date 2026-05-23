package com.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find sum of all digits of a number
public class SumOfAllDigits {
    public static void main(String[] args) {

        int i = 123456;

        Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        // int sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum(); // does the same
        System.out.println("Sum of " + i + " is: " + sum);

    }
}
