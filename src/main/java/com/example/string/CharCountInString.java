package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountInString {

// Question: Q3. Count the occurrences of each Character from a given string. Retain the order of first occurrence.
//Input: String s = "aababbccde"
//Output: a3b3c2d1e1

    public static void main(String[] args) {
        CharCountInString t = new CharCountInString();

        // scenario 1 method 1
        t.method1("aababbccde");

    }

    // solution1:
    public void method1(String s) {

        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        char[] ch = s.toCharArray();
        for (char c : ch) {
            m.put(c, (m.getOrDefault(c, 0)) + 1);
            // getOrDefault -- returns 0 if key not present
        }

        for (Map.Entry<Character, Integer> me : m.entrySet()) {
            System.out.print(me.getKey() + "" + me.getValue());
        }
    }

    // solution2:
    public void method2() {

    }

}
