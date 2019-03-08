package com.integrals.lib.Helper;

import com.integrals.lib.LinkedList;

import java.util.Scanner;

public class LinkedListImplementation {

    private static Scanner scanner =new Scanner(System.in);

    public void Implement() {
        LinkedList Object=new LinkedList();
        int Choice = 0;

        while (Choice != 5) {
            System.out.println("\n1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            System.out.println("\n\nEnter Your Choice ::");
            Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter Number :: ");
                    Scanner scanner = new Scanner(System.in);
                    int Number = scanner.nextInt();
                    Object.insert(Number);
                    break;

                case 2:
                    System.out.println("Enter Number to delete:: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int Number1 = scanner1.nextInt();
                    Object.delete(Number1);
                    break;

                case 3:
                    Object.display();
                    break;
                case 4:
                    System.out.println("Enter Number to search:: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int Number2 = scanner2.nextInt();
                    Object.searchNodeIndex(Number2);
                    break;

            }

        }
    }
}
