package com.example.string;

import java.util.Arrays;

/*
    Merge two sorted arrays into a single sorted array
    input: {1, 3, 5} and {2, 4, 6};
    output: {1, 2, 3, 4, 5, 6}
*/
public class MergeSortedArrays {

    public static void main(String[] args) {
        MergeSortedArrays ms = new MergeSortedArrays();
        System.out.println(Arrays.toString(ms.mergedSortedArray(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
    }

    public int[] mergedSortedArray(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

//        System.arraycopy(arr1, 0, arr3, 0, arr1.length); // copying array
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

//        System.arraycopy(arr2, 0, arr3, arr1.length + 0, arr2.length); // copying array
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        Arrays.sort(arr3);
        return arr3;

    }

}
