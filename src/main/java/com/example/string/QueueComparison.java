package com.example.string;

import java.util.LinkedList;
import java.util.Queue;

public class QueueComparison {

    public static void main(String[] args) {
        QueueComparison qo = new QueueComparison();

        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        q1.offer("A");
        q1.offer("B");
        q1.offer("C");

        q2.offer("A");
        q2.offer("B");
        q2.offer("C");
        q2.offer("D");

        System.out.println("Both queues are EQUAL is: " + qo.checkQueueEquality(q1, q2));
    }

    public boolean checkQueueEquality(Queue<String> q1, Queue<String> q2) {
        return q1.equals(q2); // check if both queue items are same and in same order
    }

}
