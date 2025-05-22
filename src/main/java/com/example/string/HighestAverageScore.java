package com.example.string;


/*
Given a 2-D String array of student-marks, find the student with the highest average score and output their average score. If the average score is in decimals, round it down to the nearest integer.
        Example 2:
Input: [{"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"}, {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}]
Output: 92
Explanation:
Alice's scores are 90 and 95, resulting in an average of 92.5, which rounds down to 92.
Bob's average is 82.5, which rounds down to 82.
Charlie's average is 80.


String[][] input = {            {"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"},             {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}        };

Note: Don't assume candidates are appearing only in 2 exams or same number of exams
*/


import java.util.HashMap;
import java.util.Map;

public class HighestAverageScore {

    public static void main(String[] args) {
        String[][] studentMark = {{"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"}, {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}};

        System.out.println("Highest Average Mark is: " + getHighestAverage(studentMark));

    }

    // TODO: Explanation Required
    public static int getHighestAverage(String[][] studentMarks) {

        Map<String, int[]> stdScores = new HashMap<String, int[]>();
        String nameHighest = "";
        int avgHighest = -1;

        for (String[] stdMark : studentMarks) {
            String name = stdMark[0];
            int mark = Integer.parseInt(stdMark[1]);

            if (!stdScores.containsKey(name)) {
                stdScores.put(name, new int[]{0, 0}); // it assumes only 2 subject marks
            }

            int[] currMark = stdScores.get(name);
            currMark[0] += mark;
            currMark[1]++; // ?

            for (Map.Entry<String, int[]> entry : stdScores.entrySet()) {
                String student = entry.getKey();
                int[] scores = entry.getValue();
                int totalScore = scores[0];
                int count = scores[1];

                // Calculate the average and round it down
                int average = totalScore / count;

                // Compare and update the highest average and student
                if (average > avgHighest) {
                    avgHighest = average;
                    nameHighest = student;
                }
            }
        }
        System.out.println("The student with the highest average score is " + nameHighest +
                " with an average of " + avgHighest + ".");
        return avgHighest;
    }

}
