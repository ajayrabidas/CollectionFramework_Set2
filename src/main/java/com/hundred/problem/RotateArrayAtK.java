package com.hundred.problem;

/*
Given an array, rotate it to the right by K positions.

Example
Input  : [1, 2, 3, 4, 5, 6, 7]
K      : 3

Output : [5, 6, 7, 1, 2, 3, 4]
*/

import java.util.Arrays;

public class RotateArrayAtK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int n = arr.length;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));
    }


    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


    }

}
