package com.hundred.problem;

// Remove all white spaces from a string
public class RemoveSpacesFromString {

    public static void main(String[] args) {
        RemoveSpacesFromString removeSpacesFromString = new RemoveSpacesFromString();
        System.out.println(removeSpacesFromString.removeSpaces("Hel o o o"));

        System.out.println(removeSpacesFromString.removeSpacesTwoPointer("Hel o o o"));

    }

    public String removeSpaces(String str) {
        return str.replace(" ", "");
    }

    public String removeSpacesTwoPointer(String str) {
        int n = str.length();
        int i = 0;
        int itr = 0;

        char[] ch = str.toCharArray();
        while (i < n) {
            if (ch[i] != ' ') {
                ch[itr++] = ch[i];
            }
            i++;
        }
        return new String(ch, 0, itr);
    }

}
