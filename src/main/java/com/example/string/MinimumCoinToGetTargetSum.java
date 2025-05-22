package com.example.string;

import java.sql.SQLOutput;

public class MinimumCoinToGetTargetSum {

    /*
    Given an array of coins[] of size n and a target value sum, where coins[i] represent
    the coins of different denominations. You have an infinite supply of each of the coins.
    The task is to find the minimum number of coins required to make the given value sum.
    If it is not possible to form the sum using the given coins, return -1.
    */
    public static void main(String[] args) {

        int[] coins = {5, 2, 1, 10, 20};
        System.out.println("Minimum coins to target sum: " + getCoinCount(coins, 30));
        System.out.println("Minimum coins to target sum: " + getCoinCount(coins, 19));
        System.out.println("Minimum coins to target sum: " + getCoinCount(coins, 0));
        System.out.println("Minimum coins to target sum: " + getCoinCount(coins, 5));

    }

    // TODO: yet to be done
    public static int getCoinCount(int[] coins, int targetSum) {
        System.out.println("Target Sum: " + targetSum);
        if (targetSum == 0)
            return 0;
        if (targetSum < 0)
            return -1;

        int coinsReq = Integer.MAX_VALUE;


        int sum = 0;


        return -1;
    }

}