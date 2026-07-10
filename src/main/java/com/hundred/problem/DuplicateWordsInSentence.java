package com.hundred.problem;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful and easy";

        String[] arrWords = sentence.split(" ");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : arrWords) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (String word : wordFrequency.keySet()) {
            if (wordFrequency.get(word) > 1) {
                System.out.println("Duplicate word: " + word);
            }
        }

    }

}
