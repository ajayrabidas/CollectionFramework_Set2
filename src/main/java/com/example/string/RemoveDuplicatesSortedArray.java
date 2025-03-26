package com.example.string;

import java.util.*;

public class RemoveDuplicatesSortedArray {

// Question: Q9. Remove duplicates from a sorted array
//

    public static void main(String[] args) {
        RemoveDuplicatesSortedArray t = new RemoveDuplicatesSortedArray();

        // scenario 1 method 1
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6};
        System.out.print("\nNew size: " + t.method1(arr));

        // scenario 2 method 1
//        t.method1();

        // scenario 3 method 1
//        t.method1();

        // scenario 4 method 2
//        t.method2();

        // scenario 5 method 2
//        t.method2();

        // scenario 6 method 2
//        t.method2();

    }

    // solution1:
    public int method1(int[] arr) {
        int newSize = 0;

        Set<Integer> se = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!se.contains(arr[i])) {
                se.add(arr[i]);
                // arr[newSize] - here element is only added if unique
                arr[newSize++] = arr[i];
            }
        }
        for (int j = 0; j < newSize; j++) {
            System.out.print(arr[j] + " ");
        }
        return newSize;

    }
}
