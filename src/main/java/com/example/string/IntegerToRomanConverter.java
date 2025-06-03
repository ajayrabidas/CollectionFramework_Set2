package com.example.string;

/*
https://leetcode.com/problems/integer-to-roman/
    I	1
    V	5
    X	10
    L	50
    C	100
    D	500
    M	1000

Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from
the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.

If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol,
for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX.
Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).

Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
You cannot append 5 (V), 50 (L), or 500 (D) multiple times.
If you need to append a symbol 4 times use the subtractive form.

Input: num = 3749
Output: "MMMDCCXLIX"

Input: num = 58
Output: "LVIII"

Input: num = 1994
Output: "MCMXCIV"

Note: 1 <= num <= 3999
*/

/*
Visualization:
        1	2	3	4	5	6	7	8	    9
        I	II	III	IV	V	VI	VII	VIII    IX

        10	20	30	40	50	60	70	80	    90
        X	XX	XXX	XL	L	LX	LXX	LXXX	XC

        100	200	300	400	500	600	700	800	    900
        C	CC	CCC	CD	D	DC	DCC	DCCC	CM
*/


public class IntegerToRomanConverter {
    public static void main(String[] args) {

        IntegerToRomanConverter irc = new IntegerToRomanConverter();
        int num1 = 3749;
        int num2 = 58;
        int num3 = 1994;

        System.out.println("Converted " + num1 + " : " + irc.convertToRoman(num1));
        System.out.println("Converted " + num2 + " : " + irc.convertToRoman(num2));
        System.out.println("Converted " + num3 + " : " + irc.convertToRoman(num3));

    }


    public String convertToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "Invalid input: Please enter number between 1 and 3999 inclusive";
        }

        StringBuilder sbl = new StringBuilder();

        while (num >= 1000) {
            sbl.append("M");
            num = num - 1000;
        }
        while (num >= 900) {
            sbl.append("CM");
            num = num - 900;
        }
        while (num >= 500) {
            sbl.append("D");
            num = num - 500;
        }
        while (num >= 400) {
            sbl.append("XD");
            num = num - 400;
        }
        while (num >= 100) {
            sbl.append("C");
            num = num - 100;
        }
        while (num >= 90) {
            sbl.append("XC");
            num = num - 90;
        }
        while (num >= 50) {
            sbl.append("L");
            num = num - 50;
        }
        while (num >= 40) {
            sbl.append("XL");
            num = num - 40;
        }
        while (num >= 10) {
            sbl.append("X");
            num = num - 10;
        }
        while (num >= 9) {
            sbl.append("IX");
            num = num - 9;
        }
        while (num >= 5) {
            sbl.append("V");
            num = num - 5;
        }
        while (num >= 4) {
            sbl.append("IV");
            num = num - 4;
        }
        while (num >= 1) {
            sbl.append("I");
            num = num - 1;
        }
        return sbl.toString();
    }
}
