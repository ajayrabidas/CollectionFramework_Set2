package com.example.string;

import java.util.*;

public class RemoveDuplicatesSortedArray {

// Question: Q9. Remove duplicates from a sorted array
/*
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]

    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
*/

    public static void main(String[] args) {

        // scenario 1 method 1
        System.out.println("Using method1: removeDuplicateFromArray()");
        System.out.println("\nNew size for sorted: " + removeDuplicateFromArray(new int[]{1, 2, 3, 4, 4, 5, 6, 6}));
        System.out.println("\nNew size for unsorted: " + removeDuplicateFromArray(new int[]{4, 99, 99, 5, 6, 6, 3, 4,}));

        System.out.println("Using method2: removeDuplicateSortedArray()");
        System.out.println("\nNew size for sorted: " + removeDuplicateSortedArray(new int[]{1, 2, 3, 4, 4, 5, 6, 6}));
        System.out.println("\nNew size for unsorted DOESN'T WORK: " + removeDuplicateSortedArray(new int[]{4, 99, 99, 5, 6, 6, 3, 4,}));

    }

    // solution1: O(n) Time and O(n) Space, Also, works for unsorted array
    // traverse through the array
    // if element doesn't exist in a set, keep adding unique elements to new array[newSize++]
    // return newSize
    public static int removeDuplicateFromArray(int[] arr) {
        int newSize = 0;

        Set<Integer> se = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!se.contains(arr[i])) {
                se.add(arr[i]);
                // arr[newSize] - here element is only added if unique
                arr[newSize++] = arr[i];
            }
        }

        // optional: print the new array until no duplicates, ignoring elements after the newSize
        for (int j = 0; j < newSize; j++) {
            System.out.print(arr[j] + " ");
        }
        return newSize;
    }

    // solution 2: O(n) Time and O(1) Space; Works only for sorted array
    public static int removeDuplicateSortedArray(int[] arr) {
        int newSize = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[newSize++] = arr[i];
            }
        }
        // optional: print the new array until no duplicates, ignoring elements after the newSize
        for (int j = 0; j < newSize; j++) {
            System.out.print(arr[j] + " ");
        }
        return newSize;
    }
}