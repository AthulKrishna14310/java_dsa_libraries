package com.integrals.lib;

public class BinarySearchTree {
    private BNode newNode;
    private BNode root;
    private BNode current;
    private BNode parent;

    public void insertNode(int data){
    newNode=new BNode(data);
    if(root==null){
        root=newNode;
      }
    else{
      current=root;
      while(true){
        parent=current;
        if(data<current.getData()) {
            current = current.getLeftChild();
            if (current == null) {
                parent.setLeftChild(newNode);
                return;
            }
        }else{
            current=current.getRightChild();
            if(current==null){
                parent.setRightChild(newNode);
                return;
            }
        }
       }
      }
    }

    public void preOrderTraversal(BNode localRoot){
        if(localRoot!=null){
            System.out.println(localRoot.getData()+"-->");
            preOrderTraversal(localRoot.getLeftChild());
            preOrderTraversal(localRoot.getRightChild());

        }else {
            System.out.println("No Elements");
        }
    }
    public void inOrderTraversal(BNode localRoot){
        if(localRoot!=null){
            inOrderTraversal(localRoot.getLeftChild());
            System.out.println(localRoot.getData()+"-->");
            inOrderTraversal(localRoot.getRightChild());
        }else {
            System.out.println("No Elements");
        }
    }

    public void postOrderTraversal(BNode localRoot){
        if(localRoot!=null){
            postOrderTraversal(localRoot.getLeftChild());
            postOrderTraversal(localRoot.getRightChild());
            System.out.println(localRoot.getData()+"-->");

        }else {
            System.out.println("No Elements");
        }
    }
    public void traversePreOrder(){
        preOrderTraversal(parent);
    }
    public void traversePostOrder(){
        postOrderTraversal(parent);
    }
    public void traverseinOrder(){
        inOrderTraversal(parent);
    }
}
