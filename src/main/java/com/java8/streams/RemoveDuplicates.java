package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove duplicate elements from a list using Java 8 streams
public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> li = Arrays.asList("India", "Japan", "China", "India", "Japan");
        System.out.println("List with non-unique elements:\n" + li);

        List<String> liUnique = li.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique List:\n" + liUnique);

    }


}
