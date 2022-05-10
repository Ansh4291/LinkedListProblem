package com.bridgelabz_Stack;

import java.util.Scanner;

public class Operation {
    MyStack.Node top = null;
    void push(Scanner sc){
        System.out.println("Enter data");
        int data = sc.nextInt();
        MyStack.Node newNode = new MyStack.Node(data);
        if (top == null)
        {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
    }
    void pop(){
        if (top == null){
            System.out.println("Stack is empty");
        }else {
            top = top.next;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void peek()
    {
        if (top != null) {
            System.out.println(top.data);
        }
        else {
            System.out.println("Stack is empty");
        }
    }
    void display(){
        MyStack.Node temp = top;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
