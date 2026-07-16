package com.hundred.problem;

import java.util.HashSet;
import java.util.Set;

// Find longest substring without repeating characters
public class LongestSubstring {

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.getLongestSubstring("abcbadbd"));
    }

    public int getLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return -1;
        }

        Set<Character> se = new HashSet<>();

        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (se.contains(s.charAt(right))) {
                se.remove(s.charAt(left));
                left++;
            }
            se.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }

}
