package com.example.string;

/*
Formula for Factorial
n! = n * (n-1) * (n-2) * (n-3) * ........ * 1
*/

public class Factorial {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.computeFactorial(1)); // 1
        System.out.println(f.computeFactorial(2)); // 2
        System.out.println(f.computeFactorial(3)); // 6
        System.out.println(f.computeFactorial(4)); // 24
        System.out.println(f.computeFactorial(8)); // 40320
    }

    public int computeFactorial(int n) {

        if (n <= 0) {
            System.out.println("Please enter a valid positive integer");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


}
