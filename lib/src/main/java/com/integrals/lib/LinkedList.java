package com.integrals.lib;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        }

    public void insert(int data){
        Node node=new Node(data);
        if(first==null){
            first=node;
            first.next=null;
            last=node;
        }else{
        Node temp=first;
        while (temp.next!=null){
              temp=temp.next;
              }

        temp.next=node;
        last=temp.next;
        }

    }

    public Node search(int data){

        if(first.getData()==data){
            System.out.print("\nDeleting the first node \n");
            return first;
        }else if(last.getData()==data){
            System.out.print("\nDeleting the last node \n");
            return last;
        }else {
            Node temp = first;
            while (temp.next != null) {
                if (temp.getData() == data) {
                    return temp;
                } else {
                    temp = temp.next;
                }
            }
        }
        System.out.print("\nNo node found\n");
        return null;
    }

    public void delete(int data){

        Node deleteNode=search(data);
        if(deleteNode==first){
            System.out.print("Deleting "+first.getData());
            first=first.next;
        } else if(deleteNode!=null){
            System.out.print("Deleting "+deleteNode.getData() );
            Node previousNode=getPreviousNode(deleteNode);
            previousNode.next=deleteNode.next;

        }else {
            System.out.print("\nNo node found to delete");

        }
    }

    public void searchNodeIndex(int data){
        Node temp=first;
        int Count=0;
        boolean flag=false;
        while(temp.next!=null){
            if(temp.getData()==data){
                System.out.print("Node found at "+Count);
                flag=true;
                break;
                }else {
                temp = temp.next;
                Count++;
            }
        }
        if(flag==false){
            System.out.print("No Node found");

        }

    }


    private Node getPreviousNode(Node deleteNode) {
    Node temp=first;
    while(temp.next!=null){
        if(temp.next==deleteNode){
            return temp;
        }else {
            temp = temp.next;
        }
      }
    return temp;
    }


    public void display(){
        Node temp=first;
        while (temp.next!=null){
            System.out.print(temp.getData()+"-->>");
            temp=temp.next;
        }
    }
}
