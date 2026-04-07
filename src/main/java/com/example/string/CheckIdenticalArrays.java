package com.example.string;

public class CheckIdenticalArrays {

    public static void main(String[] args) {

        CheckIdenticalArrays cia = new CheckIdenticalArrays();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        int[] arr3 = {1, 2, 3, 4};


        System.out.println(cia.validateArrays(arr1, arr2));
        System.out.println(cia.validateArrays(arr1, arr3));
        System.out.println(cia.validateArrays(arr2, arr3));

    }

    public boolean validateArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            System.out.println("Length doesn't match. Not Identical");
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Not Identical " + arr1[i] + " and " + arr2[i]);
                return false;
            }
        }
        System.out.println("Identical");
        return true;
    }

}
