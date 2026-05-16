package com.java8.streams;

import java.util.Arrays;
import java.util.List;

// Given list of integers, print the numbers which are multiples of 5
public class PrintMultiples {

    public static void main(String[] args) {
        List<Integer> liIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        liIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
    }
}
