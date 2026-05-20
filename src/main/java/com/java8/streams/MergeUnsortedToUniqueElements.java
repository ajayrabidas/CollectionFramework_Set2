package com.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

// Merge two unsorted arrays into single sorted array without duplicates
public class MergeUnsortedToUniqueElements {


    public static void main(String[] args) {
        int[] a = {4, 2, 5, 1};
        int[] b = {8, 1, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println("Merged sorted without duplicates: " + Arrays.toString(c));

    }
}
