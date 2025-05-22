package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {

        String str = "example";

        System.out.println("Index of unique character is: " + getFirstUniqueCharacter(str));

        System.out.println("Using ASCII value");
        System.out.println("Index of unique character is: " + getFirstUniqueCharacterUsingASCII(str));
    }

    // Using linked hash map
    public static int getFirstUniqueCharacter(String str) {

        char[] ch = str.toCharArray();
        Map<Character, Integer> me = new LinkedHashMap<Character, Integer>();

        for (char c : ch) {
            me.put(c, (me.getOrDefault(c, 0)) + 1);
        }

        for (Map.Entry<Character, Integer> e : me.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First Unique Character: " + e.getKey());
                return str.indexOf(e.getKey());
            }
        }

        return -1;
    }


    // using ASCII value of character
    public static int getFirstUniqueCharacterUsingASCII(String str) {
        int[] charCounts = new int[256];
        int stringLength = str.length();

        for (int i = 0; i < stringLength; i++) {
            charCounts[str.charAt(i)]++;
        }

        for (int i = 0; i < stringLength; i++) {
            if (charCounts[str.charAt(i)] == 1) {
                System.out.println("First Unique character is: " + str.charAt(i));
                return i;
            }
        }

        return -1;
    }


}
