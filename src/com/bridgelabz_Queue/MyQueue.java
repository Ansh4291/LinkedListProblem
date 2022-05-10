package com.bridgelabz_Queue;

import com.bridgelabz_Stack.MyStack;

public class MyQueue {
    int data;
    MyQueue next;

    // constructor to create a new linked list node
    public MyQueue(int data)
    {
      this.data = data;
        next = null;
    }
}
