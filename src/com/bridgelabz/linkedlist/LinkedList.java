package com.bridgelabz.linkedlist;

public class LinkedList {

        Node head;
        Node tail;
        Node prev;

    // push element into linked list
    public void push(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            Node temp = head;
            this.head = node;
            node.next = temp;
        }
//        return node;
    }

    // Displaying element of Linked List
        public void print() {
            Node temp = head;
            if (head == null) {
                System.out.println("Linked List is Empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.data+ " ");
                    temp = temp.next;
                }
            }
        }

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                this.tail.next = newNode;
                tail = newNode;
            }
        }

        public void insertInBetween(Node previousNode ,Node newNode){
            Node tempNode = previousNode.next;
            previousNode.next = newNode;
            newNode.next = tempNode;
        }
    public void pop(){
        if (head != null){
            Node temp = head;
            head = head.next;
        }
    }
//
public  Node removeLastNode() {

    if (head == null)
        return null;

    if (head.next == null) {
        return null;
    }

    // Find the second last node
    Node second_last = head;
    while (second_last.next.next != null)
        second_last = second_last.next;
//    int pos;
//    for (int i = 0; i < pos-1; i++){
//        second_last = second_last.next;
//        }
    // Change next of second last
    second_last.next = null;

    return head;
}
    }

