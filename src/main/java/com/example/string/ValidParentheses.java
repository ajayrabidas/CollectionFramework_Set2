package com.example.string;

import java.util.Stack;

/*
Description: https://leetcode.com/problems/valid-parentheses/description/
    Valid:
        Input: s = "()"
        Input: s = "()[]{}"
    Invalid:
        Input: s = "(]"
        Input: s = "([])"
*/
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([])";

        System.out.println("Valid Parenthesis: "+checkParenthesesValidity(str1));
        System.out.println("Valid Parenthesis: "+checkParenthesesValidity(str2));
        System.out.println("Valid Parenthesis: "+checkParenthesesValidity(str3));
        System.out.println("Valid Parenthesis: "+checkParenthesesValidity(str4));

    }

    public static boolean checkParenthesesValidity(String str){

        if(str == null){
            System.out.println("Invalid input: null string");
            return false;
        } else if (str.isEmpty()){
            System.out.println("Invalid input: empty string");
            return false;
        }

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            } else if ( !st.isEmpty() && st.peek() == '(' && str.charAt(i) == ')' ){
                st.pop();
            } else if ( !st.isEmpty() && st.peek() == '{' && str.charAt(i) == '}' ){
                st.pop();
            } else if ( !st.isEmpty() && st.peek() == '[' && str.charAt(i) == ']' ){
                st.pop();
            } else return false;
        }
        return st.empty();
    }
}
