package com.example.string;

import java.util.Stack;

public class ValidParenthesesCheck {

    public static void main(String[] args) {

        System.out.println("Given parentheses [[{{}}]]() is valid: " + validateParenthese("[[{{}}]]()"));
        System.out.println("Given parentheses [[{{}}]]() is valid: " + validateParenthese("[[{{}}]]("));
        System.out.println("Given parentheses [[{{}}]]() is valid: " + validateParenthese("[[{{}}]()"));
        System.out.println("Given parentheses (())) is valid: " + validateParenthese("(()))"));
        System.out.println("Given parentheses 'empty' is valid: " + validateParenthese(""));


    }


    public static boolean validateParenthese(String str) {
        if (str.isEmpty())
            return false;

        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                st.push(ch[i]);
            } else if (!st.isEmpty() && st.peek() == '(' && ch[i] == ')') {
                st.pop();
            } else if (!st.isEmpty() && st.peek() == '{' && ch[i] == '}') {
                st.pop();
            } else if (!st.isEmpty() && st.peek() == '[' && ch[i] == ']') {
                st.pop();
            } else if (st.isEmpty() && (ch[i] == ')' || ch[i] == '}' || ch[i] == ']'))
                return false;
        }
        return st.isEmpty();
    }
}
