package com.example.string;

public class DistanceBetweenTwoWords {

// Question: Q10. Given a sentence or phrase and two words. Return the minimum distance between the words.
//Example: String str = “the quick the brown quick brown the frog”
//String word1 = “quick”
//String word2 = "frog"
//Return 3

    public static void main(String[] args) {
        DistanceBetweenTwoWords t = new DistanceBetweenTwoWords();

        // scenario 1 method 1
        String str = "the quick the brown quick brown the frog";
        String w1 = "quick";
        String w2 = "frog";

        System.out.println("Minimum Distance: " + t.checkDistance(str, w1, w2));

    }

    // solution1:
    public int checkDistance(String str, String w1, String w2) {
        if (w1.equals(w2))
            return 0;

        String[] sar = str.split(" ");
        int index1 = -1;
        int index2 = -1;
        int tempDistance;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < sar.length; i++) {
            if (sar[i].equals(w1)) {
                index1 = i;
            }
            if (sar[i].equals(w2)) {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1) {
                tempDistance = Math.abs(index1 - index2);
                if (minDistance > tempDistance) {
                    minDistance = tempDistance;
                }
            }
        }
        return minDistance;
    }

    // solution2:
}
