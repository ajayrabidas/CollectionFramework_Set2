package com.example.string;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D"); // offer() if fails, return false
        queue.add("F"); // add() if fails, throws IllegalStateException

        System.out.println("Queue is: " + queue);

        System.out.println("Getting front element: " + queue.peek()); // queue.peek() gets "A"

        System.out.println("Removing Element: " + queue.poll()); // queue.poll]() removes "A"

        System.out.println("Queue after removing: " + queue); // shows queue after removal of "A"
    }
}
