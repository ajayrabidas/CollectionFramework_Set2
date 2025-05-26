package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {

    // Question:
/*
	You are given a 2D array where each element consists of a student's name and an array of integers
	representing that student's marks. The task is to compute the highest average marks among all students
	and return the average.
	Optionally, you may also print the name of the student with the highest average.

	A student may have multiple marks, and the number of marks can vary between students.

	The marks can be positive or negative.

			Example:
	java
			Copy
	Edit
	String[][] input = {
			{"Charles", "[84, 20]"},
			{"John", "[100, 23]"},
			{"Andy", "[37]"}
	};
	Output:
	cpp
			Copy
	Edit
61.5  // (John's average: (100 + 23) / 2)
	Bonus (Optional):
	Also return the name of the student with the highest average:

			"John has the highest average: 61.5"
	*/
    public static void main(String[] args) {

        String[][] studentMarks = {{"Charles", "[84, 20]"},{"John", "[100, 23]"},{"Andy", "[37]"}};
        System.out.println(getHighestAverageScore(studentMarks));
    }

    // solution1:
    public static String getHighestAverageScore(String[][] studentMarks) {

        if (studentMarks == null || studentMarks.length < 1)
            return "Invalid input";
        String nameHighest = "";
        int avgHighest = -1;

        // for each of the student and marks, get the name and marks
        for (String[] stdMark : studentMarks) {
            String name = stdMark[0];
            String[] marksString = stdMark[1].replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(" ", "")
                    .split(",");

            int[] marks = new int[marksString.length];
            int totalMarks = 0;
            for (int i = 0; i < marksString.length; i++) {
                marks[i] = Integer.parseInt(marksString[i]);
                totalMarks += marks[i];
            }
            int average = totalMarks / marksString.length;

            // check and assign maximum average found
            if (average > avgHighest) {
                avgHighest = average;
                nameHighest = name;
            }

        }
        return nameHighest + " has the highest average: " + avgHighest;
    }
}
