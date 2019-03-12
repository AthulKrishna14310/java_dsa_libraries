package com.integrals.lib;

public class LinkedList {
    private Node first;
    private Node last;
    private int  size;
    public LinkedList() {

        this.first = null;
        this.size=0;
        }

    public void insertAtLast(int data){
        Node node=new Node(data);
        if(first==null){
            first=node;
            first.next=null;
            last=node;
            size++;
        }else{
        Node temp=first;
        while (temp.next!=null){
              temp=temp.next;
              }

        temp.next=node;
        last=temp.next;
        size++;
        }

    }

    public void insertAtFirst(int data){
        if(first==null){
            Node node=new Node(data);
            first=node;
            first.next=null;
            size++;
        }else {
            Node node=new Node(data);
            Node temp = first;
            node.next = temp;
            first = node;
            size++;
        }
    }


    public void insertAtPosition(int data,int position){
        if(first==null) {
            Node _node=new Node(data);
            first = _node;
            size++;
        }

        else {
            if(position<=size) {
                Node node = new Node(data);
                Node x = first;
                Node temp = first;
                for (int i = 0; i < position; i++) {
                    x = temp;
                    temp = temp.next;
                }
                //-->1-->2-->3--->4-->5
                //pos 3
                //x=3, temp=4;
                Node y = temp;
                x.next = node;
                //-->1-->2-->3--->20-->5
                node.next = y;
                size++;
                //-->1-->2-->3--->20-->4-->5
              }else{
                System.out.print("Sorry position out of size");
                   }
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


    public void deleteData(int data){

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

    public void deleteLast(){
    Node temp=first;
    Node previous=first;
    while (temp.next!=null){
        previous=temp;
        temp=temp.next;
        }
    previous.next=null;
    }


    public void deleteFirst(){
        first=first.next;
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
        while (temp!=null){
            System.out.print(temp.getData()+"-->>");
            temp=temp.next;
        }
    }
}
