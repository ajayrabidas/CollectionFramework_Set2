package com.hundred.problem;

public class CountVowelConsonants {
    /*

        Input : String = "HelloIndia"
        Output: Number of Vowels = 5
        Number of Consonants = 8

        Input : String = "Alice"
        Output: Number of Vowels = 3
        Number of Consonants = 2
    */
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        String str = "HelloIndia";
        String vowelReference = "aeiosAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (vowelReference.indexOf(ch) != -1) {
                    vowels++;
                } else consonants++;
            }
        }

        System.out.println("Total Vowels: " + vowels + "\nTotal Consonants: " + consonants);
    }

}
