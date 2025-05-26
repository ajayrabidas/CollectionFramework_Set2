package com.example.string;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 or 3 steps. In how many distinct ways can you climb to the top?
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

        1 <= n <= 45
*/
public class ClimbingStairsToReachTop {

    public static void main(String[] args) {
        System.out.println("Steps: 0 Ways: " + waysToClimbStairs(0));
        System.out.println("Steps: 1 Ways: " + waysToClimbStairs(1));
        System.out.println("Steps: 2 Ways: " + waysToClimbStairs(2));
        System.out.println("Steps: 3 Ways: " + waysToClimbStairs(3));
        System.out.println("Steps: 4 Ways: " + waysToClimbStairs(4));
        System.out.println("Steps: 5 Ways: " + waysToClimbStairs(5));
        System.out.println("Steps: 6 Ways: " + waysToClimbStairs(6));
        System.out.println("Steps: 99 Ways: " + waysToClimbStairs(20));
    }

    public static int waysToClimbStairs(int noOfSteps) {
        if (noOfSteps == 0 || noOfSteps == 1)
            return 1;

        return waysToClimbStairs(noOfSteps - 1) + waysToClimbStairs(noOfSteps - 2);
    }

}
