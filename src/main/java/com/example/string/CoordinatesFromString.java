package com.example.string;

/*
"Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
        return the final coordinates after traversing the string.

        Examples:
Given (0,0) and String - ""UUU""
Answer : (0,3)

Given (0,0) and String - ""URRDDL""
Answer : (1,-1)

Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
Answer : (-1,-1)"
*/


import java.util.Arrays;

public class CoordinatesFromString {

    public static void main(String[] args) {

        System.out.println("Final Coordinates for string UUU is: " + Arrays.toString(getFinalCoordinates("UUU")));
        System.out.println("Final Coordinates for string URRDDL is: " + Arrays.toString(getFinalCoordinates("URRDDL")));
        System.out.println("Final Coordinates for string DDD is: " + Arrays.toString(getFinalCoordinates("DDD")));
        System.out.println("Final Coordinates for string DUDUDUDDD is: " + Arrays.toString(getFinalCoordinates("DUDUDUDDD")));

    }

    public static int[] getFinalCoordinates(String str) {

        int x = 0;
        int y = 0;

        for (char c : str.toCharArray()) {
            if (c == 'U') {
                y += 1;
            }
            if (c == 'D') {
                y += -1;
            }
            if (c == 'L') {
                x += -1;
            }
            if (c == 'R') {
                x += 1;
            }
        }
        System.out.println("Final Coordinates: " + x + " and " + y);
        return new int[]{x, y};
    }
}
