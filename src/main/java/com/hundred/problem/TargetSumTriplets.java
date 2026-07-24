package com.hundred.problem;

/*
Find all triplets in an array whose sum equals a given target.

Example

Input:

Array = {1, 2, -1, 0, -2, 1}
Target = 2

Output:

        [1, 2, -1]
        [1, 0, 1]
*/

public class TargetSumTriplets {

    public static void main(String[] args) {
        TargetSumTriplets tst = new TargetSumTriplets();

        int[] arr = {1, 2, -1, 0, -2, 1};
        int target = 2;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(
                                arr[i] + " " + arr[j] + " " + arr[k]
                        );
                    }
                }

            }
        }


    }

}
