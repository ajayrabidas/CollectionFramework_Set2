package com.example.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a string str of length n (1 <= n <= 106) and a number k,
the task is to find the kth non-repeating character in the string.
    Input : str = geeksforgeeks, k = 3
    Output : r
    Explanation: First non-repeating character is f, second is o and third is r.

    Input : str = geeksforgeeks, k = 2
    Output : o

    Input : str = geeksforgeeks, k = 4
    Output : Less than k non-repeating characters in input.
*/
public class SecondNonRepeatingCharacter {

    public static void main(String[] args) {
        SecondNonRepeatingCharacter sn = new SecondNonRepeatingCharacter();

        String s = "geeksforgeeks";
        System.out.println(sn.findNthNonRepeatingChar(s, 2)); // o
        System.out.println(sn.findNthNonRepeatingChar(s, 3)); // r
        System.out.println(sn.findNthNonRepeatingChar(s, 4)); //

        ////////////// Using Java 8
        // convert
        LinkedHashMap<Character, Long> freqMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy( // group + counting
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        // filter + pick
        Character res = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .skip(1).map(Map.Entry::getKey)
                .findFirst().orElse(null); // skip first and get second
        System.out.println("Using Java 8: " + res);

        ////////////// Using Java 8 with more concise code
        Character result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .skip(1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("Using Java 8 with more concise code: " + result);
    }

    public Character findNthNonRepeatingChar(String str, int k) {

        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> me = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            me.put(ch, me.getOrDefault(ch, 0) + 1);
        }

        int n = 0;
        for (Map.Entry<Character, Integer> m : me.entrySet()) {
            if (m.getValue() == 1) {
                n++;
                if (k == n) {
                    return m.getKey();
                }
            }
        }

        return '\0';
    }

}
