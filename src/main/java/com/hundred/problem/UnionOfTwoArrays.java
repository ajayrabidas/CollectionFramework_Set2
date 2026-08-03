package com.hundred.problem;

/*
Find union of two arrays
The union contains all unique elements from both arrays.

        Example 1
Input:
arr1 = [1, 2, 3, 4]
arr2 = [3, 4, 5, 6]

Output:
        [1, 2, 3, 4, 5, 6]
*/

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        Set<Integer> se = new HashSet<>();

        for (int i : arr1) {
            se.add(i);
        }

        for (int i : arr2) {
            se.add(i);
        }

        System.out.println("Union of both arrays is: " + se);
    }

    // Using Tree set in sorted order
}
