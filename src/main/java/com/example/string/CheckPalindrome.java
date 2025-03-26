package com.example.string;

public class CheckPalindrome {

// Question:

    public static void main(String[] args) {
        CheckPalindrome t = new CheckPalindrome();

        // scenario 1 method 1
        System.out.println("Palindrome: " + t.method1("kanak"));

        // scenario 2 method 1
        System.out.println("Palindrome: " + t.method1("asdf"));

        // scenario 3 method 1
        System.out.println("Palindrome: " + t.method1(""));

    }

    // solution1: starting from two ends
    public boolean method1(String s) {
        if (s.isEmpty()) {
            System.out.println("Input valid string as the string is empty");
            return false;
        }

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (!((int) s.charAt(i) == (int) s.charAt(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    // solution2: starting from middle. Use two pointers
    public void method2() {

    }

}
