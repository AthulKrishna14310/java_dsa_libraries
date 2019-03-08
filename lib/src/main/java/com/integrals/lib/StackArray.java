package com.integrals.lib;

public class StackArray{
    private int array[];
    private int top;
    private int maxSize;

    public StackArray(int Size){
        this.maxSize=Size;
        array=new int[Size];
        top=0;
    }
    public void push(int Element){
        if(top!=maxSize) {
            array[top++] = Element;
        }
        else {
            System.out.println("Stack Overflow\n");
        }
    }
    public void pop(){
        if(top!=0){
            System.out.println(""+array[--top]);

        }else{
            System.out.println("Stack Underflow\n");
        }
    }
    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(""+array[i]);
        }
    }

}
