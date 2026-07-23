package com.hundred.problem;
/*
Given an integer array and a target sum, find all pairs of elements whose sum is equal to the target.

        Example
Input  : [2, 7, 4, 3, 5, 1, 6]
Target : 9

Output :
        [2, 7]
        [4, 5]
        [3, 6]
*/


import java.util.HashSet;
import java.util.Set;

public class TargetSumPairs {
    public static void main(String[] args) {
        TargetSumPairs tsp = new TargetSumPairs();
        tsp.getPairs(new int[]{2, 7, 4, 3, 5, 1, 6}, 9);
    }

    public void getPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int required = target - num;
            if (seen.contains(required)) {
                System.out.println("(" + required + ", " + num +")");
            }
            seen.add(num);
        }

    }

}
