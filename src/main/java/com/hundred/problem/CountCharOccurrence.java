package com.hundred.problem;

import java.util.HashMap;
import java.util.Map;

// Count occurrence of each character
public class CountCharOccurrence {

    public static void main(String[] args) {

        String str = "HelloIndia";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(characterIntegerMap);

    }


}
