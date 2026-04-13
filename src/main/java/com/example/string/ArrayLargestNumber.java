package com.example.string;

// Find Largest Number in Array
public class ArrayLargestNumber {

    public static void main(String[] args) {

        ArrayLargestNumber ln = new ArrayLargestNumber();
        System.out.println("Max: " + ln.findLargest(new int[]{10, 25, 5, 40, 15}));
    }

    public int findLargest(int[] arr) {

        int max = arr[0];

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

}
