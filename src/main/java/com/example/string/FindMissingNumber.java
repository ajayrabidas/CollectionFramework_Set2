package com.example.string;

import java.util.Arrays;

/*
Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
This array represents a permutation of the integers from 1 to n with one element missing.
Find the missing element in the array.

Examples:
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
*/
public class FindMissingNumber {

    public static void main(String[] args) {
        FindMissingNumber fm = new FindMissingNumber();
        System.out.println("Missing number is: " + fm.findMissing(new int[]{8, 2, 4, 5, 3, 7, 1})); //6
        System.out.println("Missing number is: " + fm.findMissing(new int[]{1, 2, 3, 5})); //4
        System.out.println("Missing number is: " + fm.findMissing(new int[]{1, 2, 4, 5, 3, 7, 6, 8, 10})); // 9

        System.out.println("Missing number is: " + fm.findMissingUsingSumOfNNumbers(new int[]{8, 2, 4, 5, 3, 7, 1})); //6
        System.out.println("Missing number is: " + fm.findMissingUsingSumOfNNumbers(new int[]{1, 2, 3, 5})); //4
        System.out.println("Missing number is: " + fm.findMissingUsingSumOfNNumbers(new int[]{1, 2, 4, 5, 3, 7, 6, 8, 10})); // 9
    }

    public int findMissing(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i] - 1;
            }
        }
        return -1;
    }

    public long findMissingUsingSumOfNNumbers(int[] arr) {

        long totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }

        long n = arr.length + 1; // +1 since one item is missing
        long expectedSum = n * (n + 1) / (2);
        return expectedSum - totalSum;
    }
}
