package com.example.string;

import java.util.LinkedList;
import java.util.Queue;

class Order {
    int orderId;

    Order(int orderId) {
        this.orderId = orderId;
    }
}

public class OrderProcessingUsingQueueDemo {

    public static void main(String[] args) {
        Queue<Order> orderQueue = new LinkedList<>();

        // Customers placing orders
        orderQueue.offer(new Order(101));
        orderQueue.offer(new Order(102));
        orderQueue.offer(new Order(103));
        orderQueue.offer(new Order(104));

        // While the application processes these orders
        while (!orderQueue.isEmpty()) {

            Order o = orderQueue.poll();

            System.out.println("Processing order: " + o.orderId);

            // Simulating here. Application processes the order as per actual implementation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Order processing done for: " + o.orderId);
        }
        System.out.println("All order processing completed using Queue");
    }

}
