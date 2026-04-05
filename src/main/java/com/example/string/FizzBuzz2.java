package com.example.string;

public class FizzBuzz2 {

    // Question:
/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Input: n = 3
Output: ["1","2","Fizz"]

Example 3:
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

    public static void main(String[] args) {
        FizzBuzz2 fb = new FizzBuzz2();
        System.out.println(fb.getFizzBuzz(3));
        System.out.println(fb.getFizzBuzz(5));
        System.out.println(fb.getFizzBuzz(15));
        System.out.println(fb.getFizzBuzz(1));

    }

    public String getFizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(i);
    }

}