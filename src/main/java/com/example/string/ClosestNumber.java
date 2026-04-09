package com.example.string;
/*
Given an array arr[] of sorted integers of size n. We need to find the closest value to the given number k.
Array may contain duplicate values and negative numbers. If the smallest difference with k is the same
for two values in the array return the greater value.

Examples:
    Input : arr[] = {1, 2, 4, 5, 6, 6, 8, 9}, target = 11
    Output : 9
    Explanation : 9 is closest to 11 in given array

    Input :arr[] = {2, 5, 6, 7, 8, 8, 9}, target = 4
    Output : 5
    Explanation :5 is closest to 4 in given array

    Input :arr[] = {2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32}, target = 17
    Output : 19
    Explanation : 15 and 19 both are closest to 17 in given array ,so return max(15, 19) which is 19
*/

public class ClosestNumber {

    public static void main(String[] args) {
        ClosestNumber cn = new ClosestNumber();
        int[] arr1 = {1, 2, 4, 5, 6, 6, 8, 9};
        int target1 = 11;

        int[] arr2 = {2, 5, 6, 7, 8, 8, 9};
        int target2 = 4;

        int[] arr3 = {2, 5, 6, 7, 8, 8, 9, 15, 19, 22, 32};
        int target3 = 17;

        System.out.println("Nearest: " + cn.findClosest(arr1, target1));
        System.out.println("Nearest: " + cn.findClosest(arr2, target2));
        System.out.println("Nearest: " + cn.findClosest(arr3, target3));
    }

    public int findClosest(int[] arr, int target) {

        if (arr == null || arr.length < 1) {
            System.out.println("Invalid input");
            return -1;
        }

//        int nearest = arr[0];
        int nearest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - target) <= Math.abs(arr[i - 1] - target)) { // '<=' makes the greater nearest number as nearest
                nearest = arr[i];
            }
        }

        return nearest;
    }

}
