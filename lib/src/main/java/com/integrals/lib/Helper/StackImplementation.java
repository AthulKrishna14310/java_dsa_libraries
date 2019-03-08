package com.integrals.lib.Helper;



import java.util.Scanner;
import com.integrals.lib.StackArray;
public class StackImplementation {
    private static Scanner scanner =new Scanner(System.in);

    public void Implement(){
        System.out.println("Enter the size of array :: ");
    int Limit=scanner.nextInt();
    int Choice=0;
    StackArray Object=new StackArray(Limit);

        while(Choice!=4){
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("\n\nEnter Your Choice ::");

        Choice=scanner.nextInt();
        switch(Choice){
            case 1:
                System.out.println("Enter Number :: ");
                Scanner scanner =new Scanner(System.in);
                int Number=scanner.nextInt();
                Object.push(Number);
                break;

            case 2:
                Object.pop();
                break;

            case 3:
                Object.display();
                break;

        }

    }
  }

}
