package com.hundred.problem;

import java.util.Arrays;

// Move all zeros to the end of an array
public class MoveAllZeros {

    public static void main(String[] args) {
        MoveAllZeros maz = new MoveAllZeros();
        System.out.println(Arrays.toString(maz.moveZero(new int[]{0, 1, 0, 3, 12})));
    }

    private int[] moveZero(int[] arr) {

        int pos = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[pos] = i;
                pos++;
            }
        }

        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }

        return arr;
    }
}
