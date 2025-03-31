package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingNumberInArray {

// Question: Q6. Find first non-repeating number in an array?
//try with array implementations
//try using LinkedHashMap

    public static void main(String[] args) {
        FirstNonRepeatingNumberInArray t = new FirstNonRepeatingNumberInArray();

        // scenario 1 method 1
        int[] arr = {2, 4, 3, 5, 3, 7, 8, 9, 1, 2, 4};
        System.out.println("First non-repeating: " + t.findFirstNonRepeatingNumber(arr));

    }

    // solution1: using LinkedHashMap
    public int findFirstNonRepeatingNumber(int[] arr) {

        Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
        for (int i : arr) {
            m.put(i, (m.getOrDefault(i, 0) + 1));
        }

        for (int i = 0; i < m.size(); i++) {
            if (m.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    // solution2:
    public void method2() {

    }

}
