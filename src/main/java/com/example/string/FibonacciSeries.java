package com.example.string;

/*
    Print Fibonacci Series
    Input: N = 10
    Output: 0 1 1 2 3 5 8 13 21 34 // counting starts from 1

    Input: N = 1    Output: 0
    Input: N = 2    Output: 0 1
    Input: N = 3    Output: 0 1 1
    Input: N = 4    Output: 0 1 1 2

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();

        System.out.println(fs.getFibSeries(0));
        System.out.println(fs.getFibSeries(1));
        System.out.println(fs.getFibSeries(2));
        System.out.println(fs.getFibSeries(3));
        System.out.println(fs.getFibSeries(4));
        System.out.println(fs.getFibSeries(5));
        System.out.println(fs.getFibSeries(6));
        System.out.println(fs.getFibSeries(7));
        System.out.println(fs.getFibSeries(8));
        System.out.println(fs.getFibSeries(9));
        System.out.println(fs.getFibSeries(10));
    }

    public List<Integer> getFibSeries(int n) {


        List<Integer> li = new ArrayList<>();

        if (n <= 0) {
            System.out.println("Input VALID number of integers required in the Fibonacci Series");
            li.add(-1);
            return li;
        }

        while (n >= 1) { // n>=0 should be the ideal case to compute nth fibonacci, but here we want the series
            li.add(getFibNumber(n - 1));
            n--;
        }
        Collections.reverse(li);
        return li;
    }

    public int getFibNumber(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibNumber(n - 1) + getFibNumber(n - 2);
        }
    }

}
