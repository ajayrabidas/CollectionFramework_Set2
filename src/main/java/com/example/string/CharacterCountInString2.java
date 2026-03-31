package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

// Question: Q3. Count the occurrences of each Character from a given string. Retain the order of first occurrence.
//Input: String s = "aababbccde"
//Output: a3b3c2d1e1
public class CharacterCountInString2 {

    public static void main(String[] args) {
        CharacterCountInString2 cc = new CharacterCountInString2();
        cc.getCharCount("ababcbccc");
        cc.getCharCount("hello");
        cc.getCharCount("hello there");

    }

    public void getCharCount(String str) {

        char[] ch = str.toCharArray();

        Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

        for (char c : ch) {
            mp.put(c, (mp.getOrDefault(c, 0)) + 1);
        }

        System.out.print("\nCharacter frequency is: ");
        for (Map.Entry<Character, Integer> me : mp.entrySet()) {
            System.out.print(me.getKey() + "" + me.getValue());
        }

    }


}
