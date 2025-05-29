package com.example.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesStringArray {

// Question:
/*
	Q1) Given an unsorted array. Remove duplicates and return unique elements.
	I/p : ['abc', 'bcd', 'abc', 'dcd']
	O/p: ['abc', 'bcd', 'dcd']
*/

    public static void main(String[] args) {
        System.out.println("Array with unique strings: " + removeDuplicates(new String[]{"abc", "bcd", "abc", "dcd"}));
    }

    // solution1: TODO
    public static Set<String> removeDuplicates(String[] str) {
        // add each of the element in a set of string
        // return the new set

        Set<String> se = new HashSet<>(Arrays.asList(str));
        return se;
    }

    // solution2:
    public static void method2() {

    }

}
