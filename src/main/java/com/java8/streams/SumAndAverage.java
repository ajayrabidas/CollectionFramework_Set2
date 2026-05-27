package com.java8.streams;

import java.util.Arrays;
import java.util.OptionalDouble;

// Given an integer array, find sum and average of all elements
public class SumAndAverage {

    public static void main(String[] args) {
        int[] a = new int[]{45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();
        System.out.println("Sum is: " + sum);

        OptionalDouble avg = Arrays.stream(a).average();
        System.out.println("Average is: " + avg);
    }
}
