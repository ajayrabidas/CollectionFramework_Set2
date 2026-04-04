package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString2 {

    public static void main(String[] args) {
        FirstUniqueCharacterInString2 fu = new FirstUniqueCharacterInString2();

        String str = "hello";
        String str2 = "xxxxx";
        String str3 = "";
        String str4 = "aabbccd";
        System.out.println("Index of unique character is: " + fu.getFirstUniqueChar(str));
        System.out.println("Index of unique character is: " + fu.getFirstUniqueChar(str2));
        System.out.println("Index of unique character is: " + fu.getFirstUniqueChar(str3));
        System.out.println("Index of unique character is: " + fu.getFirstUniqueChar(str4));

    }


    public int getFirstUniqueChar(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid input");
            return -1;
        }

        Map<Character, Integer> me = new LinkedHashMap<Character, Integer>();

        for (char ch : str.toCharArray()) {
            me.put(ch, me.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> m : me.entrySet()) {
            if (m.getValue() == 1) {
                System.out.println("Unique character is: " + m.getKey());
                return str.indexOf(m.getKey());
            }
        }

        return -1;
    }
}
