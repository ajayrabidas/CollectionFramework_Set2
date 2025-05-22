package com.example.string;

public class CheckPalindrome {

// Question:

    public static void main(String[] args) {
        CheckPalindrome t = new CheckPalindrome();

        // scenario 1 method 1
        System.out.println("Palindrome: " + t.checkPalindromeFromTwoEnds("kanak"));

        // scenario 2 method 1
        System.out.println("Palindrome: " + t.checkPalindromeFromTwoEnds("asdf"));

        // scenario 3 method 1
        System.out.println("Palindrome: " + t.checkPalindromeFromTwoEnds(""));

    }

    // solution1: starting from two ends
    public boolean checkPalindromeFromTwoEnds(String s) {
        if (s.isEmpty()) {
            System.out.println("Input valid string as the string is empty");
            return false;
        }

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (!(s.charAt(i) == s.charAt(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    // solution2: starting from middle.
    // Do using while loop as done in reverse vowels only
    // TODO

}
