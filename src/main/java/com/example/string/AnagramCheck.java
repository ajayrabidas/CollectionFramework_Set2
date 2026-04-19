package com.example.string;

/*
    Given two non-empty strings s1 and s2 of lowercase letters,
    determine if they are anagrams — i.e., if they contain the
    same characters with the same frequencies.

    Input: s1 = “geeks”  s2 = “kseeg”
    Output: true

    Input: s1 = "allergy", s2 = "allergyy"
    Output: false

    Input: s1 = "listen", s2 = "lists"
    Output: false
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

    public static void main(String[] args) {
        AnagramCheck ac = new AnagramCheck();
        System.out.println(ac.isAnagram("geeks", "kseeg"));
        System.out.println(ac.isAnagram("allergy", "allergyy"));
        System.out.println(ac.isAnagram("listen", "lists"));
        System.out.println(ac.isAnagram("listen", "silent"));

        System.out.println("Using Method 2:::::");
        System.out.println(ac.checkAnagram("geeks", "kseeg"));
        System.out.println(ac.checkAnagram("allergy", "allergyy"));
        System.out.println(ac.checkAnagram("listen", "lists"));
        System.out.println(ac.checkAnagram("listen", "silent"));
    }


    public boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> me = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            me.put(ch, me.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            me.put(ch, me.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> e : me.entrySet()) {
            if (e.getValue() != 0)
                return false;
        }

        return true;
    }

}
