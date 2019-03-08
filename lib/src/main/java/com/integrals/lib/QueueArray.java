package com.integrals.lib;
///20 30 40 -->Enqueue
///30 40
/// 40 -->Dequeue

public class QueueArray {

  private int array[];
  private int size;
  private int front;
  private int rear;

    public QueueArray( int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        array=new int[size];
    }

    public void enqueue(int Element){
        if(rear==size){
         System.out.print("\nQueue is full\n");
        }else {
            array[rear] = Element;
            rear++;
        }
    }

    public void dequeue(){
        if(rear==front){
        System.out.print("\nQueue is Empty\n");
        }else {
            front++;
              }
    }

    public void display(){
        for(int i=front;i<rear;i++){
            System.out.print(array[i]+"<--");
        }
        System.out.print("\n");

    }
}
