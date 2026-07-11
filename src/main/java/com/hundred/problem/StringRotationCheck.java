package com.hundred.problem;

// Check whether two strings are rotations of each other
/*
A string is said to be a rotation of another if it can be obtained by shifting
some leading characters of the original string to its end without changing the order of characters.

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

        Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.

        Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.
*/


public class StringRotationCheck {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println("s1 and s2 are rotation of each other is: " + areRotation(s1, s2));

    }

    public static boolean areRotation(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s1)) {
                return true;
            } else {
                char last = s1.charAt(s1.length() - 1);
                s1 = s1.substring(0, last);
            }

        }
        return false;
    }

}
