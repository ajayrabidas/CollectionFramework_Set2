package com.example.string;

import java.util.Arrays;

public class SecondLowestElementFromArray {

// Question: Q2. Find the second-lowest element from an integer array, efficiently.

    public static void main(String[] args) {
        SecondLowestElementFromArray t = new SecondLowestElementFromArray();

        // scenario 1 method 1
        int[] arr = {5, 7, 1, 9, 6, 8, 4};
        System.out.println("Second Lowest method1: " + t.sortAndFindSecondLowest(arr));

        // scenario 1 method 2
        t.sortAndFindSecondLowest(arr);
        System.out.println("Second Lowest metohd2: " + t.findSecondLowest(arr));
    }

    // solution1: sort and find second lowest
    public int sortAndFindSecondLowest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }

    // solution2:
    public int findSecondLowest(int[] arr) {
        int lowest = Integer.MAX_VALUE;
        int secLowest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < lowest) {
                secLowest = lowest;
                lowest = arr[i];
            } else if (secLowest > arr[i]) {
                secLowest = arr[i];
            }
        }

        return secLowest;
    }

}
