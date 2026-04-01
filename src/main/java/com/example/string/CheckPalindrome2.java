package com.example.string;

public class CheckPalindrome2 {

    public static void main(String[] args) {
        CheckPalindrome2 cp = new CheckPalindrome2();

        cp.palindromeCheck("kanak");
        cp.palindromeCheck("malayalam");
        cp.palindromeCheck("hello");
        cp.palindromeCheck("1234321");

        cp.palindromeCheckMethod2("kanak");
        cp.palindromeCheckMethod2("malayalam");
        cp.palindromeCheckMethod2("hello");
        cp.palindromeCheckMethod2("1234321");
    }


    // method 1
    public boolean palindromeCheck(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input");
            return false;
        }

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It is NOT a palindrome: " + str);
                return false;
            }
            i++;
            j--;
        }

        System.out.println("It is a palindrome: " + str);
        return true;
    }

    // method 2
    public boolean palindromeCheckMethod2(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input");
            return false;
        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (sb.toString().equals(str)) {
            System.out.println("It is a palindrome: " + str);
            return true;
        }

        System.out.println("It is not a palindrome: " + str);
        return false;

//        return sb.toString().equals(str); // more efficiently returning the boolean value
    }
}
