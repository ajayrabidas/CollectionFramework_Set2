package com.example.string;

public class CharCountConsecutiveSequence {

// Question:
/*
Given a String with consecutive chars, give the char with their frequency
Eg. input aabbbcccc  output: a2b3c4
*/

    public static void main(String[] args) {
        System.out.println("Count of each character in aabbbccccd is: " + countCharFrequency("aabbbccccd"));

    }

    // Solution1: TODO
    public static String countCharFrequency(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        // aabbbccccd

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                i = j;
                break;
            }
            sb.append(""+str.charAt(i) + count);
            count = 1;
        }
        return sb.toString();
    }

    // Solution2: TODO
    public static void method2() {

    }

}
