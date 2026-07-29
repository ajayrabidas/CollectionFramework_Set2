package com.hundred.problem;

/*
Find intersection of two sorted arrays

Given two sorted arrays, find the elements that are present in both arrays.
Example
Input:
arr1 = [1, 2, 3, 4, 5]
arr2 = [2, 4, 6, 8]

Output:
        [2, 4]
*/

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println(findIntersection(arr1, arr2));
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }

        }


        return result;
    }

}
