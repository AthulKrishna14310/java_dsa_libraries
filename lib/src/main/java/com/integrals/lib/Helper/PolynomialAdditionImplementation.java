package com.integrals.lib.Helper;

import com.integrals.lib.AddPolynomial;
import com.integrals.lib.PolynomialLinkedList;

import java.util.Scanner;

public class PolynomialAdditionImplementation {

    private PolynomialLinkedList polynomialLinkedList1;
    private PolynomialLinkedList polynomialLinkedList2;
    private PolynomialLinkedList result;
    private AddPolynomial        addPolynomial;

    public PolynomialAdditionImplementation() {
        polynomialLinkedList1=new PolynomialLinkedList();
        polynomialLinkedList2=new PolynomialLinkedList();

    }

    public void implement(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\nEnter the degree of polynomial ?");
        int degree=scanner.nextInt();
        System.out.println("\nFirst Polynomial\n");
        insertData(degree,polynomialLinkedList1);
        System.out.println("\nSecond Polynomial\n");
        insertData(degree,polynomialLinkedList2);
        addPolynomial();
        displayData();
    }

    public void insertData(int degree,PolynomialLinkedList polynomialLinkedList){
            Scanner scanner=new Scanner(System.in);
            for (int i=degree;i>=0;i--){
                System.out.println("Coefficent x^"+i+"? ");
                int coefficent=scanner.nextInt();
                polynomialLinkedList.insert(coefficent,i);
                }
             }


     public void addPolynomial(){
        addPolynomial=new AddPolynomial(polynomialLinkedList1,polynomialLinkedList2);
        addPolynomial.add();
        result=addPolynomial.getResult();
     }

     public void displayData(){
        result.display();
     }
}
