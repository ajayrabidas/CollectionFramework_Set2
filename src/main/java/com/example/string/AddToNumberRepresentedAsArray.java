package com.example.string;

import java.util.Arrays;

public class AddToNumberRepresentedAsArray {

// Question:
/*
Given an array which represents a number, add 1 to the array.
Suppose an array contain elements [1, 2, 3, 4] then the array represents decimal
number 1234 and hence adding 1 to this would result 1235. So new array will be [1, 2, 3, 5].

    Input :  [1, 2, 3, 4]
    Output : [1, 2, 3, 5]

    Input :  [1, 2, 9, 9]
    Output : [1, 3, 0, 0]

    Input:  [9, 9, 9, 9]
    Output: [1, 0, 0, 0, 0]
*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addToArray(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(addToArray(new int[]{1, 2, 9, 9})));
        System.out.println(Arrays.toString(addToArray(new int[]{9, 9, 9, 9})));
    }

    // Solution1:
    // append the array elements to a string, and add 1 to get newSum
    // return after inserting each element from newSum to an int array of length newSum
    public static int[] addToArray(int[] arr) {
        int num = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        System.out.println("Number given is: " + sb);
        num = Integer.parseInt(String.valueOf(sb)) + 1;
        System.out.println("Number formed after adding 1 is: " + num);

        int[] res = new int[String.valueOf(num).length()];
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            res[i] = Integer.parseInt(String.valueOf(ch[i]));
        }
        return res;
    }

}
