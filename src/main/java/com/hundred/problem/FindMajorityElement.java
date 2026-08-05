package com.hundred.problem;

/*
Find majority element
Given an array of size N, find the majority element.
A majority element is an element that appears more than N/2 times.
If no majority element exists, return -1.

Example 1
Input  : [2, 2, 1, 1, 2, 2, 2]

Output : 2
*/

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int limit = arr.length / 2;

        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getValue() > limit) {
                System.out.println(me.getKey());
            }
        }

    }

}
