package com.bridgelabz_Queue;

public class QueueByUsingLL {
    public static void main(String[] args) {
       Operation operation = new Operation();

        operation.enqueue(56);
        operation.enqueue(30);
        operation.enqueue(70);
        System.out.println("Queue Front : " + operation.front.data);
        System.out.println("Queue Rear : " + operation.rear.data);
    }
    }

