package com.example.string;

import java.util.*;

/*
    Input: “programming”
    output: g=2, r=2, m=2, p=1, o=1, a=1, i=1, n=1
    Print in descending order of frequency
*/
public class CharCountStringDescendingFrequency {

    public static void main(String[] args) {
        CharCountStringDescendingFrequency cc = new CharCountStringDescendingFrequency();

        cc.printCharFrequency("programming");
        cc.printCharFrequency("india");
        cc.printCharFrequency("russia");
    }

    // Using Java 7
    public void printCharFrequency(String str) {

        if (str == null || str.isEmpty())
            System.out.println("Invalid input");

        Map<Character, Integer> me = new LinkedHashMap<>();

        assert str != null;
        for (char ch : str.toCharArray()) {
            me.put(ch, me.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(me.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("\nFrequency of each character in descending order & order of occurrence is: ");
        for (Map.Entry<Character, Integer> m : list) {
            System.out.print(" " + m.getKey() + "=" + m.getValue());
        }
    }

}
