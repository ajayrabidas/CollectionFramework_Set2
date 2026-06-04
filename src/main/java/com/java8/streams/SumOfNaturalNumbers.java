package com.java8.streams;

import java.util.stream.IntStream;

// Find sum of first 10 natural numbers
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();

        System.out.println("Sum of first 10 natural numbers is: " + sum);

    }
}
