package com.example.string;

public class PalindromeNumber {

// Question:
/*
	Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
	Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.
*/

    public static void main(String[] args) {

        System.out.println("Given number 121 is palindrome: " + checkPalindrome(121));
        System.out.println("Given number -121 is palindrome: " + checkPalindrome(-121));
        System.out.println("Given number 0 is palindrome: " + checkPalindrome(0));

    }

    // Solution1: TODO
    public static boolean checkPalindrome(int num) {
        // get absolute value of num
        // reverse the num
        // compare and return if both are same

        int rev = 0;
        int temp = Math.abs(num);

        while (temp != 0) {
            rev = (rev * 10) + temp % 10;
            temp = temp / 10;
        }
        return (rev == Math.abs(num));
    }

    // Solution2: TODO
    public static void method2() {

    }

}
