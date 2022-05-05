package com.bridgelabz;

class Operations {
    Node head, tail;

    /*
    Created Method For adding Element in Linked List
    i.e public void add(int data).
     */
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node n = head;
            while (n.address != null) {
                n = n.address;
            }
            n.address = node;
        }
    }

    //          creating print method
    public void print() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.address;
            }
        }
    }
}