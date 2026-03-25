package com.example.string;

public class PalindromeCheck {

    public static void main(String[] args) {

        PalindromeCheck pc = new PalindromeCheck();
        pc.checkPalindrome("kanak");
        pc.checkPalindrome("ABCD");
        pc.checkPalindrome("");

    }

    public boolean checkPalindrome(String input) {

        if (input == null || input.isEmpty()) {
            System.out.println("Provide a valid input");
            return false;
        }


        String str = input.toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("It is a palindrome");
        return true;
    }

}
