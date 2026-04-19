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

public class AnagramCheck {

    public static void main(String[] args) {
        AnagramCheck ac = new AnagramCheck();
        System.out.println(ac.isAnagram("geeks", "kseeg"));
        System.out.println(ac.isAnagram("allergy", "allergyy"));
        System.out.println(ac.isAnagram("listen", "lists"));
        System.out.println(ac.isAnagram("listen", "silent"));
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
}
