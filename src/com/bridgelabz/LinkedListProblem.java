package com.bridgelabz;


public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Programs :-) ");
        //taking object of operation class
        //and passing the data
        Operations operations = new Operations();
        operations.add(70);
        operations.add(30);
        operations.add(56);
        //Calling the print method inside main method
        operations.print();
    }

}
