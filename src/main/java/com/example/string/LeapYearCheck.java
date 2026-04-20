package com.example.string;


/*
    A leap year has 366 days and occurs roughly every 4 years.
    A century year (ending with 00) is a leap year only if it is divisible by 400.
    A non-century year is a leap year if it is divisible by 4 but not divisible by 100.
*/

public class LeapYearCheck {

    public static void main(String[] args) {
        LeapYearCheck ly = new LeapYearCheck();
        System.out.println(ly.isLeapYear(2000)); // true
        System.out.println(ly.isLeapYear(2004)); // true
        System.out.println(ly.isLeapYear(2025)); // false
        System.out.println(ly.isLeapYear(2026)); // false
        System.out.println(ly.isLeapYear(2024)); // true
        System.out.println(ly.isLeapYear(2028)); // true
        System.out.println(ly.isLeapYear(2032)); // true
    }

    public boolean isLeapYear(int n) {

        if (n % 400 == 0)
            return true;

        return (n % 4 == 0 && n % 100 != 0);
        
    }
}
