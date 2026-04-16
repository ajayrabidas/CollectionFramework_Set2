package com.example.string;

/*
Input: GeeksForGeeks
Output: Total no of vowels in string are: 5
*/

public class CountVowels {

    public static void main(String[] args) {
        CountVowels cv = new CountVowels();
        System.out.println("Total vowels are: " + cv.totalVowels("GeeksForGeeks"));
        System.out.println("Total vowels are: " + cv.totalVowelsMethod2("GeeksForGeeks"));
    }


    public int totalVowels(String str) {
        if (str == null || str.isEmpty()) return -1;

        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public int totalVowelsMethod2(String str) {
        if (str == null || str.isEmpty()) return -1;

        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
