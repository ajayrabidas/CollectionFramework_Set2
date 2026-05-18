package com.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

// Merge two unsorted arrays into single sorted array using Java 8 streams
public class MergeUnsortedArray {

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};

//        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
//        System.out.println("Merged Array: " + Arrays.toString(c));

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println("Merged and Sorted Array: " + Arrays.toString(c));


    }

}
