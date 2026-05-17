package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Given a list of integers, find maximum and minimum of those numbers
public class MaxMinFromList {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = li.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number is: " + max);

        int min = li.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum number is: " + min);

    }

}
