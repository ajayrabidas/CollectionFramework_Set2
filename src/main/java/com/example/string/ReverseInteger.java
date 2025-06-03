package com.example.string;

public class ReverseInteger {

// Question:
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes
the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1: Input: x = 123 Output: 321
Example 2: Input: x = -123 Output: -321
Example 3: Input: x = 120 Output: 21
32-bit:         -2,147,483,648 to 2,147,483,647
*/

    public static void main(String[] args) {
        System.out.println("Reverse of 123 is: " + reverseInt(123));
        System.out.println("Reverse of -123 is: " + reverseInt(-123));
        System.out.println("Reverse of 9999999999 is: " + reverseInt(987654321));
        // Below doesn't work with the given reverseInt() method
        // the output is some garbage value as the reverse overflows
        System.out.println("Reverse of 1000000045 is: " + reverseInt(1000000045));
        System.out.println("Reverse of -2147483648 is: " + reverseInt(-2147483648));

    }

    // Solution1:
    public static int reverseInt(int num) {
        int rev = 0;

        while ((num != 0)) {
            rev = (rev * 10) + num % 10;
            num = num / 10;
        }
        return rev;
    }

    // Solution2: handle overflows TODO
    public static void method2() {

    }

}
