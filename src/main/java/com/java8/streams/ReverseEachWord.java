package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

// Reverse each word of a string using Java 8 streams
public class ReverseEachWord {

    public static void main(String[] args) {
        String str = "Hello and welcome to India";

        String reversed = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);
    }

}
