package com.hundred.problem;


/*
Find leaders in an array
An element is called a Leader if it is greater than or equal to all the elements to its right.

The last element is always a leader because there are no elements to its right.

        Example
Input  : [16, 17, 4, 3, 5, 2]
Output : [17, 5, 2]
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingArrayLeaders {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeaders(arr));
    }


    public static List<Integer> findLeaders(int[] arr) {

        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }
}
