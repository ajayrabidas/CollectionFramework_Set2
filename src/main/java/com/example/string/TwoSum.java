package com.example.string;

import java.util.Arrays;

public class TwoSum {

// Question:
/*
	Given an array of integers nums
	and an integer target, return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution,
	and you may not use the same element twice.	You can return the answer in any order.
Example 1:
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/


    public static void main(String[] args) {
        System.out.println("Target indices are: " + Arrays.toString(getTwoSum(new int[]{3, 5, 4, 2, 6}, 9)));
        System.out.println("Target indices are: " + Arrays.toString(getTwoSum(new int[]{3, 5, 55, 2, 6}, 61)));
        System.out.println("Target indices are: " + Arrays.toString(getTwoSum(new int[]{3, 5, 4, 2, 66}, 69)));
        System.out.println("Target indices are: " + Arrays.toString(getTwoSum(new int[]{3, 5, 4, 2, 6}, -9)));

    }

    // solution1: repeatedly take each element and check if any other element makes up the sum
    public static int[] getTwoSum(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return new int[]{-1, -1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // Solution2: solve same with less than O(n2) TODO
    public static int[] getTargetSum(int[] arr, int target) {

        return new int[]{-1, -1};
    }

}
