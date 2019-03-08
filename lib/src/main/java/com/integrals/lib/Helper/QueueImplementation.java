package com.integrals.lib.Helper;

import com.integrals.lib.QueueArray;
import com.integrals.lib.StackArray;

import java.util.Scanner;



public class QueueImplementation {

    private static Scanner scanner =new Scanner(System.in);

    public void Implement() {

        System.out.println("Enter the size of Queue :: ");
        int Limit = scanner.nextInt();
        int Choice = 0;
        QueueArray Object = new QueueArray(Limit);

        while (Choice != 4) {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("\n\nEnter Your Choice ::");

            Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter Number :: ");
                    Scanner scanner = new Scanner(System.in);
                    int Number = scanner.nextInt();
                    Object.enqueue(Number);
                    break;

                case 2:
                    Object.dequeue();
                    break;

                case 3:
                    Object.display();
                    break;

            }

        }
    }
}

