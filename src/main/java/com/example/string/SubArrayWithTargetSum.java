package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithTargetSum {

// Question: Q5. Given an array. find the Sub-array where sum = k.

    public static void main(String[] args) {
        SubArrayWithTargetSum t = new SubArrayWithTargetSum();

        // scenario 1 method 1
        int[] arr = {1, 2, 3, 1, 59};
        System.out.println("Sub-array with required sum: " + t.findTargetSum(arr, 6));
    }

    // solution1:
    public int findTargetSum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> me = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                count++;
            }

            if (me.containsKey(sum - k)) {
                count = count + me.get(sum - k);
            }
            me.put(sum, me.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
