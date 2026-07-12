package com.hundred.problem;

public class StringCompression {

    public static void main(String[] args) {

        String input = "aaabbcc";

        StringBuilder sbl = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {

            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sbl.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("Compressed string is: " + sbl.toString());
    }


}
