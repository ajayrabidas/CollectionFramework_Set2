package com.example.string;

public class FindTargetFromSortedArray {

    //    Given a sorted array, find the target.
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 11, 15, 21};
        System.out.println("Target 15 found in index: " + getTarget(arr, 15));
        System.out.println("Target 21 found in index: " + getTarget(arr, 21));
        System.out.println("Target 3 found in index: " + getTarget(arr, 3));
    }


    public static int getTarget(int[] arr, int target) {

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
