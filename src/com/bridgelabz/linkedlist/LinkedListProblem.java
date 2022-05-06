package com.bridgelabz.linkedlist;


import java.util.Scanner;

public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Programs :-) ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to add the data at start ");
        System.out.println("Press 2 to add the data at end ");
        System.out.println("Press 3 to add the data at insert in between ");
        int chooseNumber = sc.nextInt();
        switch (chooseNumber){
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
        }


    }

}
