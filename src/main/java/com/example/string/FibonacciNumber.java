package com.example.string;

/*
    Given an integer n. The task is to find the nth Fibonacci Number
    Fibonacci Series is: 0,1,1,2,3,5,8,13 ...

    Input: n = 3
    Output: 3

    Input: n = 7
    Output: 13
*/

public class FibonacciNumber {

    public static void main(String[] args) {
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println(fn.getFibonacci(9));
        System.out.println(fn.getFibonacci(5));
        System.out.println(fn.getFibonacci(6));
        System.out.println(fn.getFibonacci(7));
    }

    public int getFibonacci(int input) {
        if (input < 0) {
            System.out.println("Please input positive integer");
            return -1;
        } else if (input == 0)
            return 0;
        else if (input == 1 || input == 2)
            return 1;
        else {
            return getFibonacci(input - 1) + getFibonacci(input - 2);
        }
    }
}
