package com.example.string;

import java.util.Arrays;

public class RobotDirection {

    // Question:
/*
Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
		return the final coordinates after traversing the string.

			Examples:
	Given (0,0) and String - ""UUU""
	Answer : (0,3)

	Given (0,0) and String - ""URRDDL""
	Answer : (1,-1)

	Additional testcase : String - ""DOWN UP 2xRIGHT DOWN 3xLEFT""
	Answer : (-1,-1)"

			"For the additional test case,
	the strings DOWN, UP, RIGHT AND LEFT should be reduced to their first character;
2xRIGHT means move right twice.

			So, DOWN UP 2xRIGHT DOWN 3xLEFT
	translates to the string DURRDLLL."
	*/
    public static void main(String[] args) {
        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("UUU")));
        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("URRDDL")));
        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("DURRDLLL")));

        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("LLRRLRLUD")));
        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("RURURU")));
        System.out.println("Final Coordinates are: " + Arrays.toString(getFinalLocation("LURU")));

    }

    // solution1:
    public static int[] getFinalLocation(String str) {
        int x = 0;
        int y = 0;

        for (char c : str.toCharArray()) {
            if (c == 'U')
                x += 1;
            if (c == 'D')
                x += -1;
            if (c == 'R')
                y += 1;
            if (c == 'L')
                y += -1;
        }
        return new int[]{x, y};
    }

    // solution2:
    public void method2() {

    }

}
