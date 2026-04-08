package com.example.string;

import java.util.Arrays;

public class TwoSum2 {

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
        TwoSum2 ts = new TwoSum2();
        System.out.println("Target indices are: " + Arrays.toString(ts.getIndices(new int[]{3, 5, 4, 2, 6}, 9)));
        System.out.println("Target indices are: " + Arrays.toString(ts.getIndices(new int[]{3, 5, 55, 2, 6}, 61)));
        System.out.println("Target indices are: " + Arrays.toString(ts.getIndices(new int[]{3, 5, 4, 2, 66}, 69)));
        System.out.println("Target indices are: " + Arrays.toString(ts.getIndices(new int[]{3, 5, 4, 2, 6}, -9)));

    }

    public int[] getIndices(int[] arr, int target) {

        if (arr == null || arr.length < 1) {
            System.out.println("Invalid input");
            return new int[]{-1, -1};
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }

        return new int[]{-1, -1};
    }
}
