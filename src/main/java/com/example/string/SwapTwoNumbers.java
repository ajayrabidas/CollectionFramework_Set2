package com.example.string;

/*
    Input: a = 1 b = 2
    Output: 2 1
    Explanation: Initially a = 1 and b = 2, now a = 2 and b = 1.
*/

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 1, b = 2;
        SwapTwoNumbers sp = new SwapTwoNumbers();
        sp.swap(a, b);
        sp.swapWithoutVariable(a, b);
    }

    public void swap(int a, int b) {
        System.out.println("Input>> a: " + a + " b: " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Output>> a: " + a + " b: " + b);
    }

    public void swapWithoutVariable(int a, int b) {
        System.out.println("Input: a: " + a + " b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Input: a: " + a + " b: " + b);


    }
}
