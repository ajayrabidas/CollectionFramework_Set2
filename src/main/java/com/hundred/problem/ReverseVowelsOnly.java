package com.hundred.problem;

// Reverse only vowels in a string
public class ReverseVowelsOnly {
    public static void main(String[] args) {
        System.out.println(getReversedVowelsInString("Hello"));
        System.out.println(getReversedVowelsInString("aeiou"));
    }

    public static String getReversedVowelsInString(String s) {
        StringBuilder vowels = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.append(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.append(vowels.charAt(vowels.length() - j));
                j++;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

}