package com.java8.streams;

// Given a list of integers, separate odd and even numbers?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenFiltering {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        // partitioningBy() -- splits in 2 groups, mean for boolean conditions
        System.out.println("Using partitioningBy():::::::::::::");
        Map<Boolean, List<Integer>> me = li.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even numbers: " + me.get(true));
        System.out.println("Odd numbers: " + me.get(false));

        // Alternately using filters
        System.out.println("\n\nUsing filter():::::::::::::");
        List<Integer> even = li.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = li.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        // Using Java 7
        System.out.println("\n\nUsing Java 7:::::::::::::");
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for (int i : li) {
            if (i % 2 == 0) {
                evenNum.add(i);
            } else oddNum.add(i);
        }

        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd numbers: " + oddNum);

    }

}
