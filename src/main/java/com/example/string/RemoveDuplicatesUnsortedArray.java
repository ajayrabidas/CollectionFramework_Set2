package com.example.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsortedArray {

// Question: Remove duplicates from unsorted array without sorting the elements

    public static void main(String[] args) {

        System.out.println("New size after removing duplicates: " + removeDuplicates(new int[]{1, 2, 3, 4, 4, 5, 6, 6}));
        System.out.println("New size after removing duplicates: " + removeDuplicates(new int[]{4, 99, 99, 5, 6, 6, 3, 4,}));

    }

    // solution1:
    // add each element to a set unless it is not present in the set
    // keep increasing the size of the new array based on the elements added
    // optionally print the new array before returning the new array size
    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length < 1)
            return -1;

        int newSize = 0;
        Set<Integer> se = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!se.contains(arr[i])) {
                se.add(arr[i]);
                arr[newSize++] = arr[i];
            }
        }

        System.out.print("New array is: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        return newSize;
    }
}
