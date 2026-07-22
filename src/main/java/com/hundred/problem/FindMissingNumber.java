package com.hundred.problem;

// Find missing number from 1 to N
    /*
    Input  : [1, 2, 4, 5]
    N      : 5

    Output : 3
    */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        FindMissingNumber fmn = new FindMissingNumber();
        fmn.getMissingNumber(arr, n);
    }


    public void getMissingNumber(int[] arr, int n) {

        int sumOfAllNIntegers = (n) * (n + 1) / 2;
        int actualSumOfGivenIntegers = 0;

        for (int i : arr) {
            actualSumOfGivenIntegers += i;
        }

        int missingNumber = sumOfAllNIntegers - actualSumOfGivenIntegers;

        System.out.println("Missing number is: " + missingNumber);

    }

}
