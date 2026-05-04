package com.example.string;


/*
    Given an integer array nums, move all 0's to the end of it while maintaining the
    relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]
*/

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        System.out.println((Arrays.toString(mz.moveAllZeroesToEnd(new int[]{0, 1, 0, 3, 12}))));
    }

    // Copy non-zero to a temp array
    // Fill unfilled temp array with zeros
    // Copy back all elements from temp to original array
    public int[] moveAllZeroesToEnd(int[] arr) {
        int[] arrNew = new int[arr.length];

        int j = 0;
        for (int i : arr) {
            if (i != 0)
                arrNew[j++] = i;
        }

        while (j < arr.length)
            arrNew[j++] = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrNew[i];
        }

        return arr;
    }

    // TODO: Two Traversal method

    // TODO: One traversal method

}