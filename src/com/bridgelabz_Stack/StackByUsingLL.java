package com.bridgelabz_Stack;

import java.util.Scanner;

public class StackByUsingLL {
    public static void main(String[] args) {
        int chooseNo;
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        int ans;
        do {
            System.out.println("Press 1 to push operation");
            System.out.println("Press 2 to display operation");
            chooseNo = sc.nextInt();
            switch (chooseNo) {
                case 1:
                    operation.push(sc);
                    break;
                case 2:
                    operation.display();
                    break;
                default:
                    System.out.println("Enter invalid input");
                    break;
            }
            System.out.println("if you want to continue press 1");
            ans = sc.nextInt();
        }while (ans == 1);
        System.out.println("EXIT Sucessfully");
    }
}