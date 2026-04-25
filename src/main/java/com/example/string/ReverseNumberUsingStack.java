package com.example.string;


import java.util.Stack;

public class ReverseNumberUsingStack {


    public static void main(String[] args) {
        ReverseNumberUsingStack rn = new ReverseNumberUsingStack();
        System.out.println("Reversed number of 2345 using stack is: " + rn.reverseNumber(2345));
    }

    public int reverseNumber(int i) {

        // push the digits to a new stack
        Stack<Integer> st = new Stack<>();
        while (i != 0) {
            st.push(i % 10);
            i = i / 10;
        }

        // pop the pushed digits from the stack until the stack is empty
        int reversed = 0;
        int j = 1;
        while (!st.empty()) {
            reversed = reversed + (st.peek() * j);
            st.pop();
            j = j * 10;
        }

        return reversed;
    }


}
