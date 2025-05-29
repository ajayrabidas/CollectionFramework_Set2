package com.example.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

// Question:

    public static void main(String[] args) {

        System.out.println("Longest consecutive sequence: " + longestConsecutiveSeq(new int[]{1, 2, 3, 4, 4, 5, 6, 6}));
        System.out.println("Longest consecutive sequence: " + longestConsecutiveSeq(new int[]{4, 99, 99, 5, 6, 6, 3, 4,}));

        System.out.println("Longest consecutive sequence: " + longestConsecutiveSeqWithoutSorting(new int[]{1, 2, 3, 4, 4, 5, 6, 6}));
        System.out.println("Longest consecutive sequence: " + longestConsecutiveSeqWithoutSorting(new int[]{4, 99, 99, 5, 6, 6, 3, 4,}));

    }

    // solution1: sort and check consecutive left right elements
    public static int longestConsecutiveSeq(int[] arr) {

        // sort the array
        // for each element check if
        // arr[i] is equal to previous element
        // if yes, the skip and continue next
        // if arr[i] is one more than previous element, then increment count
        // else reset count
        // get max of count vs result

        if (arr == null || arr.length == 0)
            return 0;

        Arrays.sort(arr);

        int maxLen = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue;

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }

    // solution2: without sorting
    public static int longestConsecutiveSeqWithoutSorting(int[] arr) {
        // add all elements to a set

        // for each element,
        // check if set contains the element and doesn't contain the previous element

        // while the set contains the current element
        // remove the element and keep incrementing the count and next element

        // get the maximum length from the current length and previously calculated length
        // repeat the same process for each of the element using the starting for loop

        if (arr == null || arr.length == 0)
            return 0;

        int maxLen = 0;
        Set<Integer> se = new HashSet<>();

        for (int ele : arr) {
            se.add(ele);
        }

        for (int ele : arr) {

            if (se.contains(ele) && !se.contains(ele - 1)) {
                int currentEle = ele;
                int count = 0;

                while (se.contains(currentEle)) {
                    se.remove(currentEle);
                    currentEle++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

}
