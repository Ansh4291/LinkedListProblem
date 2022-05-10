package com.bridgelabz_Queue;

import com.bridgelabz.linkedlist.Node;

public class Operation {
    MyQueue front, rear;

    public Operation()
    {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int data)
    {

        // Create a new LL node
        MyQueue temp = new MyQueue(data);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }


}