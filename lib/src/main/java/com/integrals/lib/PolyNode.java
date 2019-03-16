package com.integrals.lib;

public class PolyNode {
    private int coefficient;
    private int exponent;
    private PolyNode next;

    public PolyNode(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next=null;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public PolyNode getNext() {
        return next;
    }

    public void setNext(PolyNode next) {
        this.next = next;
    }
}
