package com.hundred.problem;
/*
Find equilibrium index
An index is called an equilibrium index if:
Sum of elements on the left = Sum of elements on the right
The element at the equilibrium index itself is not included in either sum.
        Example
        Array = { -7, 1, 5, 2, -4, 3, 0 }
        Index = 3

    At index 3:
    Left Sum  = -7 + 1 + 5 = -1
    Right Sum = -4 + 3 + 0 = -1
    Therefore:
    Equilibrium Index = 3
*/

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        
        int leftsum = 0;
        int totalsum = 0;

        for (int i : arr) {
            totalsum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            int rightsum = totalsum - leftsum - arr[i];

            if (leftsum == rightsum) {
                System.out.println("Equilibrium index is: " + i);
            }

            leftsum += arr[i];
        }

    }
}
