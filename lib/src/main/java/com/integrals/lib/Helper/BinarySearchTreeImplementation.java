package com.integrals.lib.Helper;

import com.integrals.lib.BinarySearchTree;
import com.integrals.lib.QueueArray;

import java.util.Scanner;

public class BinarySearchTreeImplementation {
    private Scanner scanner=new Scanner(System.in);
    private BinarySearchTree Object=new BinarySearchTree();

    public void implement() {
        int Choice = 0;
        while (Choice != 4) {
            System.out.println("1.Insert");
            System.out.println("2.In-Order   Traversal");
            System.out.println("3.Pre-Order  Traversal");
            System.out.println("4.Post-Order Traversal");
            System.out.println("\n\nEnter Your Choice ::");

            Choice = scanner.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter Number :: ");
                    Scanner scanner = new Scanner(System.in);
                    int Number = scanner.nextInt();
                    Object.insertNode(Number);
                    break;

                case 2:
                    Object.traverseinOrder();
                    break;

                case 3:
                    Object.traversePreOrder();
                    break;

                case 4:
                    Object.traversePostOrder();
                    break;

            }

        }
    }
}
