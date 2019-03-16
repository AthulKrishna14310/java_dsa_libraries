package com.integrals.lib;

public class PolynomialLinkedList {
    private PolyNode first;
    private PolyNode last;
    private int      size;

    public PolynomialLinkedList() {
        this.first=null;
        this.last=null;
        this.size=0;
    }

    public PolyNode getFirst() {
        return first;
    }

    public PolyNode getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

    public void setLast(PolyNode last) {
        this.last = last;
    }

    public void setFirst(PolyNode first) {
        this.first = first;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insert(int coefficient, int exponent){

        PolyNode node=new PolyNode(coefficient,exponent);

        if(first==null){
            first=node;
            first.setNext(null);
            last=node;
            size++;
        }else{
            PolyNode temp=first;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }

            temp.setNext(node);
            last=temp.getNext();
            size++;
        }


    }

    public void display(){
        PolyNode temp=first;
        while (temp!=null){
            System.out.println(temp.getCoefficient()+"x^"+temp.getExponent());
            temp=temp.getNext();
        }
    }



}
