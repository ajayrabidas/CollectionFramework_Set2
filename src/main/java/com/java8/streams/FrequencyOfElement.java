package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Frequency of each element in an array or a list
public class FrequencyOfElement {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pencil", "Pen", "Pen", "Eraser");
        Map<String, Long> countStationery = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countStationery);
    }

}
