package com.example.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

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
        System.out.println(fizzBuzz(3));

    }

    // Solution1: for each of the number from 1 to n
    // if divisible by 3 and 5 >> FizzBuzz
    // if by 3 only >> Fizz
    // if by 5 only >> Buzz
    // else just add the number to the list
    public static List<String> fizzBuzz(int n) {

        List<String> li = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                li.add("FizzBuzz");
            } else if (i % 3 == 0) {
                li.add("Fizz");
            } else if (i % 5 == 0) {
                li.add("Buzz");
            } else li.add(Integer.toString(i));
        }
        return li;
    }


    // Solution2: TODO
    public static void method2() {

    }

}
