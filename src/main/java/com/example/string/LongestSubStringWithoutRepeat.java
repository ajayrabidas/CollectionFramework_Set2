package com.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeat {

// Question: Q8. Find length of longest substring without repeat

    public static void main(String[] args) {
        LongestSubStringWithoutRepeat t = new LongestSubStringWithoutRepeat();

        // scenario 1 method 1
        System.out.println("Max Lenght of sub-string without repetetion: " + t.findLongestSubstring("aabcdefghabce"));
    }

    // solution1:
    public int findLongestSubstring(String str) {

        int maxLen = Integer.MIN_VALUE;
        Set<Character> se = new HashSet<Character>();
        int l = 0;
        int r;
        for (r = 0; r < str.length(); r++) {
            if (se.contains(str.charAt(r)) && l < r) {
                se.remove(str.charAt(l));
                l++;
            }
            se.add(str.charAt(r));
            maxLen = Math.max(maxLen, (r - l + 1));
        }

        return maxLen;
    }

    // solution2:
    public void method2() {

    }

}
