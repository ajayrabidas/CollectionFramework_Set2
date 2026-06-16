package com.java8.streams;

import java.util.stream.Stream;

// First 10 odd numbers
public class FirstNOddNumbers {

    public static void main(String[] args) {

        Stream.iterate(new int[]{1, 3}, i -> new int[]{i[1], i[1] + 2})
                .limit(10)
                .map(i -> i[0])
                .forEach(i -> System.out.print(i + " "));
    }
}
