package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find second largest number in a list of integers
public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargest = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println("Second Largest Number is: " + secondLargest);

    }
}
