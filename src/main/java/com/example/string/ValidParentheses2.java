package com.example.string;

import java.util.Stack;

public class ValidParentheses2 {

    /*
Description: https://leetcode.com/problems/valid-parentheses/description/
    Valid:
        Input: s = "()"
        Input: s = "()[]{}"
    Invalid:
        Input: s = "(]"
        Input: s = "([])"
*/

    public static void main(String[] args) {
        ValidParentheses2 vp = new ValidParentheses2();

        System.out.println("Valid Parenthesis: " + vp.checkValidity("()"));
        System.out.println("Valid Parenthesis: " + vp.checkValidity("()[]{}"));
        System.out.println("Valid Parenthesis: " + vp.checkValidity("(]"));
        System.out.println("Valid Parenthesis: " + vp.checkValidity("([])"));

    }

    public boolean checkValidity(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                st.push(str.charAt(i));
            else if (!st.isEmpty() && st.peek() == '(' && str.charAt(i) == ')')
                st.pop();
            else if (!st.isEmpty() && st.peek() == '[' && str.charAt(i) == ']')
                st.pop();
            else if (!st.isEmpty() && st.peek() == '{' && str.charAt(i) == '}')
                st.pop();
        }

        return st.isEmpty();
    }

}
