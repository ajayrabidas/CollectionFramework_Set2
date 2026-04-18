package com.example.string;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        PrimeNumberCheck pnc = new PrimeNumberCheck();
        System.out.println(pnc.isPrimeNumber(3));
    }

    public boolean isPrimeNumber(int n) {

        if (n == 0 || n == 1) return false;
        if (n == 2) return true;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i + " Divides " + n);
                return false;
            }
        }

        return true;
    }
}
