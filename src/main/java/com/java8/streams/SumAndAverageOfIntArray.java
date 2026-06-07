package com.java8.streams;

import java.util.Arrays;

// Given an integer array, find sum and average of all elements
public class SumAndAverageOfIntArray {

    public static void main(String[] args) {
        int[] arr = new int[]{45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum is: " + sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Average is: " + avg);

    }
}
