package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter2 {

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
        FirstNonRepeatingCharacter2 fn = new FirstNonRepeatingCharacter2();
        System.out.println(fn.getFirstNonRepeatingCharacter("hello"));
        System.out.println(fn.getFirstNonRepeatingCharacter("1234123"));
        System.out.println(fn.getFirstNonRepeatingCharacter("abcdefabcef"));
        System.out.println(fn.getFirstNonRepeatingCharacter("xxxxx"));
    }

    public Character getFirstNonRepeatingCharacter(String str) {
        char[] ch = str.toCharArray();

        Map<Character, Integer> me = new LinkedHashMap<>();
        for (char c : ch) {
            me.put(c, me.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> m : me.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }

        return (0);
    }
}
