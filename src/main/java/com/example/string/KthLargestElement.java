package com.example.string;

/*
    Given an integer array nums and an integer k, return the kth largest element in the array.
    Note that it is the kth largest element in the sorted order, not the kth distinct element.
    Can you solve it without sorting?

    Example 1:
    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
    Example 2:

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
*/

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        KthLargestElement kth = new KthLargestElement();
        System.out.println(kth.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    // Sort and Fine
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

}
