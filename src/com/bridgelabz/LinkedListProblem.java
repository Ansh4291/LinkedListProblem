package com.bridgelabz;
class Node{
    public int data;
    public Node address;

    public Node(int data){
        this.data = data;
        this.address = null;
    }
}
public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Programs :-) ");
            Node firstNode = new Node(56);
            Node secondNode = new Node(30);
            Node thirdNode = new Node(70);
            firstNode.address = secondNode;
            secondNode.address = thirdNode;
            Node temp = firstNode;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.address;
            }
    }
}
