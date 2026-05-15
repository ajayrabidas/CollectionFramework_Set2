package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class JoinPrefixSuffixToString {

    public static void main(String[] args) {

        List<String> lis = Arrays.asList("Book", "Pen", "Pencil", "Notebook", "Scissors");
        String joinedString = lis.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }

}
