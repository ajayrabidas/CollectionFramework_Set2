package com.example.string;

public class SubArrayWithHighestTotal {

// Question: Q4. Find 5 continuous sub-arrays which has the highest total
//Given integer array: [1,8,5,3,12,10,3,2,7]
//brute force: will be expensive here
//sliding window: should be more efficient

    public static void main(String[] args) {
        SubArrayWithHighestTotal t = new SubArrayWithHighestTotal();

        // scenario 1 method 1
        int[] arr = {1, 8, 5, 3, 12, 10, 3, 2, 7};
        System.out.println("Maximum sum with sub-array size 5: " + t.method1(arr, 5));

    }

    // solution1:
    public int method1(int[] arr, int subArrSize) {

        int maxSum = 0;
        for (int i = 0; i + subArrSize <= arr.length; i++) {
            int temp = 0;
            for (int j = i; j < i + subArrSize; j++) {
                temp = temp + arr[j];
            }
            if (temp > maxSum) {
                maxSum = temp;
            }
        }
        return maxSum;
    }

    // solution2:
    public void method2() {

    }

}
