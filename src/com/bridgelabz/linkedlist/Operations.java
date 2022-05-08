package com.bridgelabz.linkedlist;

class Operations {
    public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        System.out.println("Element is added at start\n");
    }
    /*
  Created a method to add data at end.
   */
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        System.out.println();
        linkedList.print();
        System.out.println("Element is added at end position \n");
    }
    /*
    /*
 Created a method to add data in between.
  */
//    public static void insertInBetween() {
//        LinkedList linkedList = new LinkedList();
//        Node secondNode = linkedList.
//        Node firstNode = linkedList.push(56);
//        Node newNode= new Node(30);
//        System.out.println("Before insert");
//        linkedList.print();
//        linkedList.insertInBetween(firstNode, newNode);
//        System.out.println("");
//        System.out.println("after insert");
//        linkedList.print();
//        System.out.println("");
//    }

    public static void deleteElement(){
       LinkedList linkedList = new LinkedList();
       linkedList.pop();
       linkedList.print();
    }
    public static void deleteLastNode(){
        LinkedList linkedList = new LinkedList();
        linkedList.removeLastNode();
        linkedList.print();


    }

}