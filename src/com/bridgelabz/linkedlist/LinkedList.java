package com.bridgelabz.linkedlist;

public class LinkedList {

        Node head;
        Node tail;
    // push element into linked list
        public Node push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                Node temp = head;
                this.head = newNode;
                newNode.next = temp;
            }
            return newNode;
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
//            return;
        }
    }
    }

