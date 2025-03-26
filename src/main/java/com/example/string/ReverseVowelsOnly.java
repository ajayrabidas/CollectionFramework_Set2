package com.example.string;

public class ReverseVowelsOnly {

// Question: Q1. Reverse all the vowels in a given string maintaining the initial order of consonants.

    public static void main(String[] args) {
        ReverseVowelsOnly t = new ReverseVowelsOnly();

        // scenario 1 method 1
        System.out.println("Result: " + t.method1("India"));

        // scenario 2 method 1
        System.out.println("Result: " + t.method1(""));

        // scenario 3 method 1
        System.out.println("Result: " + t.method1(null));

    }

    // solution1:
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }

        return false;
    }

    public String method1(String s) {

        if (s == null) {
            System.out.println("Null Encountered");
            return "";
        }

        if (!s.isEmpty()) {
            System.out.println("Original: " + s);

            char[] ch = s.toCharArray();
            StringBuilder sbl = new StringBuilder();

            for (char c : ch) {
                if (isVowel(c)) {
                    sbl.append(c);
                }
            }

            StringBuilder sbl2 = new StringBuilder(s);
            int j = sbl.length() - 1;
            for (int i = 0; i < s.length(); i++) {
                if (isVowel(s.charAt(i))) {
                    sbl2.setCharAt(i, sbl.charAt(j));
                    j--;
                }
            }
            return sbl2.toString();
        }

        return "";
    }
}
