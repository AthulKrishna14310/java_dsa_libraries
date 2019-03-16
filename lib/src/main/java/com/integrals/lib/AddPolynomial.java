package com.integrals.lib;

public class AddPolynomial {

    private PolynomialLinkedList first;
    private PolynomialLinkedList second;
    private PolynomialLinkedList temp;
    private int limit;

    public AddPolynomial(PolynomialLinkedList first,
                         PolynomialLinkedList second) {
        this.first = first;
        this.second = second;
        this.temp=null;
        this.limit=first.getSize();

    }
    public PolynomialLinkedList getResult(){
     for(int i=0;i<limit;i++){
         temp.insert(first.getFirst().getCoefficient()
                 +second.getFirst().getCoefficient(),first.getFirst().getExponent());
         first.setFirst(first.getFirst().getNext());
         second.setFirst(first.getFirst().getNext());
          }
     return temp;
    }
}
