package com.example.string;

import java.util.Arrays;

public class ReverseAlphabetsOnly {

// Question:
/*
Question: Reverse the string. Keep the special characters in their original position:
Input: Ra#je$sh
Output: hs#ej$aR

Hint:
A-Z = 65 - 90
a-z = 97 - 122
*/

    public static void main(String[] args) {
        System.out.println("Reverse of Ra#je$sh is: " + getReversedString("Ra#je$sh"));
        System.out.println("Reverse of Ka$tri(*&na is: " + getReversedString("Ka$tri(*&na"));
        System.out.println("Reverse of @#$%^&*( is: " + getReversedString("@#$%^&*("));
        System.out.println("Reverse of Rajesh is: " + getReversedString("Rajesh"));

    }

    // Solution1: two pointer approach
    // check characters from start index and end index
    // if left is special, increment left index
    // if right is special, increment right index
    // if left & right both are not special, revers the characters
    public static String getReversedString(String str) {
        if (str == null || str.isEmpty())
            return "Invalid Input";

        int left = 0;
        int right = str.length() - 1;

        char[] ch = str.toCharArray();
        char temp;

        while (left < right) {
            while (left < right && isSpecial(ch[left])) {
                left++;
            }
            while (left < right && isSpecial(ch[right])) {
                right--;
            }
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }

    public static boolean isSpecial(Character ch) {
        return (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')));
    }
}
