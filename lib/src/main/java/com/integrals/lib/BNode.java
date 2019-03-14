package com.integrals.lib;

public class BNode {
    private BNode leftChild;
    private BNode rightChild;
    private int  data;

    public BNode(int data) {
        this.leftChild=null;
        this.rightChild=null;
        this.data = data;
    }

    public BNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BNode leftChild) {
        this.leftChild = leftChild;
    }

    public BNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
