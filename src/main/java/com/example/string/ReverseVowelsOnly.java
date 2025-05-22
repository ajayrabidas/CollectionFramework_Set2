package com.example.string;

public class ReverseVowelsOnly {

    public static void main(String[] args) {
        // reverseVowels
        System.out.println(reverseVowels("Goldman"));
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels(""));

        // reverseVowels
        System.out.println(reverseVowelsOnly("Goldman"));
        System.out.println(reverseVowelsOnly("hello"));
        System.out.println(reverseVowels(""));

        // reverseConsonantsOnly
        System.out.println(reverseConsonantsOnly("Goldman"));
        System.out.println(reverseConsonantsOnly("hello"));
        System.out.println(reverseVowels(""));

    }

    // solution 1: brute-fore approach
    // Store the vowels in a StringBuilder, rearrange vowels only in a StringBuilder(str)
    // O(n) Time and O(n) Space
    public static String reverseVowels(String str) {

        if (str != null && !str.isEmpty()) {
            // store the vowels in a StringBuilder
            StringBuilder vowelsOnly = new StringBuilder();

            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (isVowel(c)) {
                    vowelsOnly.append(c);
                }
            }

            //store the given string in a new StringBuilder
            StringBuilder reversedStr = new StringBuilder(str);

            // replace the existing vowels in the new StringBuilder
            int j = vowelsOnly.length() - 1;
            for (int i = 0; i < str.length(); i++) {
                if (isVowel(str.charAt(i))) {
                    reversedStr.setCharAt(i, vowelsOnly.charAt(j));
                    j--;
                }
            }
            return reversedStr.toString();
        }
        return "";
    }

    // solution 2: Reversing the vowels only, keeping consonants in place
    // Two Pointers - O(n) Time and O(1) Space
    public static String reverseVowelsOnly(String str) {
        if (str.isEmpty())
            return "";

        int left = 0;
        int right = str.length() - 1;
        char temp;

        char[] ch = str.toCharArray();

        while (left < right) {
            while (!isVowel(ch[left]) && left < right) {
                left++;
            }
            while (!isVowel(ch[right]) && left < right) {
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

    // solution 2: Reversing the consonants only, keeping vowels in place
    // Two Pointers - O(n) Time and O(1) Space
    public static String reverseConsonantsOnly(String str) {
        if (str.isEmpty())
            return "";

        int left = 0;
        int right = str.length() - 1;
        char temp;

        char[] ch = str.toCharArray();

        while (left < right) {
            while (isVowel(ch[left]) && left < right) {
                left++;
            }
            while (isVowel(ch[right]) && left < right) {
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

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

}