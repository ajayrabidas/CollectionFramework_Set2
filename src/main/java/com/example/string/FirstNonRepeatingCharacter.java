package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

// Question:
/*
Given a string,
		return the first non-repeating character.

	Examples:
	String str1 = ""12345""
	//Return 1

	String str2 = ""abbacd""
	//Return c
*/

    public static void main(String[] args) {
		System.out.println(firstNonRepeatingChar("apple"));

    }

    // solution1: TODO
    public static Character firstNonRepeatingChar(String input) {
        char[] ch = input.toCharArray();

        Map<Character, Integer> me = new LinkedHashMap<>();

        for (Character c : ch) {
            me.put(c, (me.getOrDefault(c, 0)) + 1);
        }

        for (Map.Entry<Character, Integer> m : me.entrySet()) {
            if (m.getValue() == 1) {
				return m.getKey();
            }
        }

        return (0);
    }

    // solution2:
    public void method2() {

    }

}
