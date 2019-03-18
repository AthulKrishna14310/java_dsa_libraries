package com.integrals.lib;

public class AddPolynomial {

    private PolynomialLinkedList first;
    private PolynomialLinkedList second;
    private PolynomialLinkedList result;
    private int limit;

    public AddPolynomial(PolynomialLinkedList first,
                         PolynomialLinkedList second) {
        this.first = first;
        this.second = second;
        this.result=new PolynomialLinkedList();
        this.limit=first.getSize();

    }

    public PolynomialLinkedList getResult() {
        return result;
    }

    public void add(){
        while (true) {
            result.insert(first.getFirst().getCoefficient() + second.getFirst().getCoefficient(), first.getFirst().getExponent());
            first.setFirst(first.getFirst().getNext());
            second.setFirst(second.getFirst().getNext());
            if(first.getFirst()==null){
                return;
            }
            }
        }
}
