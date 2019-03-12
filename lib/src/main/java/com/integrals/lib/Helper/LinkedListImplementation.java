package com.integrals.lib.Helper;

import com.integrals.lib.LinkedList;

import java.util.Scanner;

public class LinkedListImplementation {

    private static Scanner scanner =new Scanner(System.in);

    public void Implement() {
        LinkedList Object=new LinkedList();
        int Choice = 0;

        while (Choice != 9) {
            System.out.print("\n");
            System.out.println("1.Insert at last");
            System.out.println("2.Insert at first");
            System.out.println("3.Insert at position");
            System.out.println("4.Delete at first");
            System.out.println("5.Delete Data");
            System.out.println("6.Delete at last");
            System.out.println("7.Display");
            System.out.println("8.Search");
            System.out.println("9.Exit");
            System.out.println("\n\nEnter Your Choice ::");

            Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter Number :: ");
                    Scanner scanner = new Scanner(System.in);
                    int Number = scanner.nextInt();
                    Object.insertAtLast(Number);
                    break;

                case 2:
                    System.out.println("Enter Number :: ");
                    Scanner scannerX = new Scanner(System.in);
                    int NumberX = scannerX.nextInt();
                    Object.insertAtFirst(NumberX);
                    break;
                case 3:
                    System.out.println("Enter Number :: ");
                    Scanner scannerY = new Scanner(System.in);
                    int NumberY = scannerY.nextInt();
                    System.out.println("Enter Position :: ");
                    int Position=scannerY.nextInt();
                    Object.insertAtPosition(NumberY,Position);
                    break;

                case 4:
                    Object.deleteFirst();
                break;
                case 5:
                    System.out.println("Enter Number to delete:: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int Number1 = scanner1.nextInt();
                    Object.deleteData(Number1);
                    break;


                case 6:
                    Object.deleteLast();
                break;

                case 7:
                    Object.display();
                    break;

                case 8:
                    System.out.println("Enter Number to search:: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int Number2 = scanner2.nextInt();
                    Object.searchNodeIndex(Number2);
                    break;

            }

        }
    }
}
