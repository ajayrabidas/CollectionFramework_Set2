package com.example.string;

import java.util.Arrays;

public class AddToNumberRepresentedAsArray2 {


//    Input :  [1, 2, 3, 4]
//    Output : [1, 2, 3, 5]

//    Input :  [1, 2, 9, 9]
//    Output : [1, 3, 0, 0]

//    Input:  [9, 9, 9, 9]
//    Output: [1, 0, 0, 0, 0]


    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        AddToNumberRepresentedAsArray2 an = new AddToNumberRepresentedAsArray2();
        an.addToArray(arr);
    }

    public void addToArray(int[] arr) {

        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i);
        }

        System.out.println("String representation is: " + sb);

        int j = Integer.parseInt(String.valueOf(sb)) + 1;
        System.out.println("After adding 1: " + j);
        String sb2 = String.valueOf(j);
        System.out.println(sb2);

        int[] arr1 = new int[sb2.length()];

        for (int i = 0; i < sb2.length(); i++) {
            arr1[i] = sb2.charAt(i) - '0'; // this will print char value of: '1' - '0' //49 - 48
        }

        System.out.println(Arrays.toString(arr1));

    }


}
