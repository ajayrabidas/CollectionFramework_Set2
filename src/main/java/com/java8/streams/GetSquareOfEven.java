package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class GetSquareOfEven {

    /*
    Provide a solution for the given input and output looking at the pattern
        int d[]={1,2,3,4,5,6}
        o/p: {4,16,36}
    */
    public static void main(String[] args) {

        int[] d = {1, 2, 3, 4, 5, 6};


        // filter all even numbers
        // get the square of the even numbers
        // add them to an array of integer
        int[] output = Arrays.stream(d).filter(n -> n % 2 == 0).map(n -> n * n).toArray();
        System.out.println(Arrays.toString(output));

        // Java 7 Style
        GetSquareOfEven gs = new GetSquareOfEven();
        System.out.println(gs.squareOfEvensOnly(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public ArrayList<Integer> squareOfEvensOnly(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                result.add(i * i);
            }
        }
        return result;
    }


}
