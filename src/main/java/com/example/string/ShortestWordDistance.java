package com.example.string;

import java.util.Arrays;

public class ShortestWordDistance {

    // Question:
/*
	Shortest Word Distance

			Description
	Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.

	Example 1:
	Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
	Output: 3

	Example 2:
	Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
	Output: 1


	Constraints:

			2 <= wordsDict.length <= 3 * 104
			1 <= wordsDict[i].length <= 10
	wordsDict[i] consists of lowercase English letters.
	word1 and word2 are in wordsDict.
	word1 != word2
	*/
    public static void main(String[] args) {
        System.out.println("Shortest distance between coding & practice is: "
                + getShortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));

        System.out.println("Shortest distance between coding & practice is: "
                + getShortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));

    }

    // solution1:
    public static int getShortestDistance(String[] words, String w1, String w2) {
        // check if input is null
        if (words == null || w1 == null || w2 == null)
            return -1;

        // check if word is empty
        if (words.length == 0 || w1.isEmpty() || w2.isEmpty())
            return -1;

        // condition when both words are same
        if (w1.equals(w2))
            return 0;

        int index1 = -1;
        int index2 = -1;
        int tempDistance;
        int minDistance = Integer.MAX_VALUE;

        // for each of the words in the string array, check if it matches w1 or w2
        // mark the index of w1 and w2, when matched
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(w1))
                index1 = i;
            if (words[i].equals(w2))
                index2 = i;

            // calculate temp distance when indexes of w1 and w2 is found
            // then check and assign if the temp distance is less than the previous calculated min distance
            if (index1 != -1 && index2 != -1) {
                tempDistance = Math.abs(index2 - index1);
                if (tempDistance < minDistance)
                    minDistance = tempDistance;
            }
        }
        return minDistance;
    }

}
