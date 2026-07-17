package com.hundred.problem;

// Find all permutations of a string
/*
Input:  s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]

Input: s = "XY"
Output: ["XY", "YX"]

Input: s = "AAA"
Output: "AAA", "AAA", "AAA", "AAA", "AAA", "AAA"
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermutationOfString {

    public static void main(String[] args) {
        PermutationOfString ps = new PermutationOfString();
        System.out.println(ps.getAllPermutation("ABC"));
        System.out.println(ps.getAllPermutation("XY"));
        System.out.println(ps.getAllPermutation("AAA"));
    }

    public List<String> getAllPermutation(String str) {
        ArrayList<String> res = permutation(str);
        return res;
    }

    public ArrayList<String> permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        recurPermute(0, new StringBuilder(str), res);
        Collections.sort(res);
        return res;
    }

    public void recurPermute(int index, StringBuilder stringBuilder, ArrayList<String> res) {
        if (index == stringBuilder.length()) {
            res.add(stringBuilder.toString());
            return;
        }

        for (int i = index; i < stringBuilder.length(); i++) {
            char temp = stringBuilder.charAt(index);
            stringBuilder.setCharAt(index, stringBuilder.charAt(i));
            stringBuilder.setCharAt(i, temp);

            recurPermute(index + 1, stringBuilder, res);

            temp = stringBuilder.charAt(index);
            stringBuilder.setCharAt(index, stringBuilder.charAt(i));
            stringBuilder.setCharAt(i, temp);
        }

    }


}
