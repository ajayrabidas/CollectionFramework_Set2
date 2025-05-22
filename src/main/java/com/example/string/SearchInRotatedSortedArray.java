package com.example.string;

/*
Search in a Sorted and Rotated Array
Given a sorted and rotated array arr[] of n distinct elements,
the task is to find the index of given key in the array. If the key is not present
in the array, return -1.
*/

/*
Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is present at index 8 in arr[].

Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: 6 is not present in arr[].

Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
*/

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

//        System.out.println(searchTarget(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
//        System.out.println(searchTarget(new int[]{1}, 0));
//        System.out.println(searchTarget(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3));
//        System.out.println(searchTarget(new int[]{3, 5, 1, 2}, 6));
//        System.out.println(searchTarget(new int[]{33, 42, 72, 99}, 42));

        System.out.println(searchTarget(new int[]{4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(searchTarget(new int[]{1}, 0));
        System.out.println(searchTarget(new int[]{5, 6, 7, 8, 9, 10, 11}, 10));
        System.out.println(searchTarget(new int[]{3, 4, 5, 6, 7}, 6));
        System.out.println(searchTarget(new int[]{33, 42, 72, 99}, 42));
    }

    // TODO
    public static int searchTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


}
