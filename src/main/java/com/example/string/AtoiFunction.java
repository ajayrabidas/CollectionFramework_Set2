package com.example.string;

public class AtoiFunction {

// Question:
/*
Implement your custom atoi function in Java.
	Given a string, you have to convert into integer. The input string may contain
	alphabets and special characters alongside numbers (both negative and positive).

	Examples:
	String str1 = ""123"";     //Return 123 (in integer format)

	String str2 = ""-123"";    //Return -123

	String str3 = ""1a23"";   //Return -1 (Invalid entry)
*/

    public static void main(String[] args) {
        System.out.println("The ascii to int of 123 is: " + customASCIIToInt("123"));
        System.out.println("The ascii to int of 1a23 is: " + customASCIIToInt("1a23"));
        System.out.println("The ascii to int of ' ' is: " + customASCIIToInt(""));
        System.out.println("The ascii does not work for -123 is: " + customASCIIToInt("-123")); // doesn't work

        System.out.println("The ascii to int of 123 is: " + customASCIIToIntConversion("123"));
        System.out.println("The ascii to int of 1a23 is: " + customASCIIToIntConversion("1a23"));
        System.out.println("The ascii to int of ' ' is: " + customASCIIToIntConversion(""));
        System.out.println("The ascii to int of -123 is: " + customASCIIToIntConversion("-123")); // doesn't work
    }

    // solution1: for positive integers only
    public static int customASCIIToInt(String str) {

        if (str == null || str.isEmpty())
            return 0;

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9')
                return 0;

            result = result * 10 + (ch - '0');

        }

        return result;
    }

    // solution2: taking minus into account TODO: check
    public static int customASCIIToIntConversion(String str) {
        if (str == null || str.isEmpty())
            return 0;

        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (ch == '-') {
                result = -1;
            } else if (ch < '0' || ch > '9') {
                result = result * 10 + (ch - '0');
            }

        }

        return result;
    }

}
