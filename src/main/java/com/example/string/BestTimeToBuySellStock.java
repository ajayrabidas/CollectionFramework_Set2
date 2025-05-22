package com.example.string;

public class BestTimeToBuySellStock {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    // https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/?ref=rp
    public static void main(String[] args) {

        System.out.println("Max profit: " + getMaxProfit(new int[]{7, 1, 5, 3, 6, 4})); // maxProfit: 5
        System.out.println("Max profit: " + getMaxProfit(new int[]{7, 10, 1, 3, 6, 9, 2})); // maxProfit: 8
        System.out.println("Max profit: " + getMaxProfit(new int[]{7, 6, 4, 3, 1})); // maxProfit: 0
        System.out.println("Max profit: " + getMaxProfit(new int[]{1, 3, 6, 9, 11})); // maxProfit: 10

    }

    public static int getMaxProfit(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;

            int profit = price - minPrice;

            if (profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
    }


}
