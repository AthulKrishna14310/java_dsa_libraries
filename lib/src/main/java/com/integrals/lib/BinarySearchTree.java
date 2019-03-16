package com.integrals.lib;

public class BinarySearchTree {
    private BNode newNode;
    private BNode root;
    private BNode current;


    public void insertNode(int data){
    newNode=new BNode(data);

    if(root==null){
        root=newNode;
      }
    else{
        current=root;
        BNode parent;

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
        if(localRoot==null) {
            return;
        }else{
            System.out.print(localRoot.getData()+"-->");
            preOrderTraversal(localRoot.getLeftChild());
            preOrderTraversal(localRoot.getRightChild());

        }
    }
    public void inOrderTraversal(BNode localRoot){
        if(localRoot==null) {
            return;
        }else{
            inOrderTraversal(localRoot.getLeftChild());
            System.out.print(localRoot.getData()+"-->");
            inOrderTraversal(localRoot.getRightChild());
             }
    }

    public void postOrderTraversal(BNode localRoot){
        if(localRoot==null){return;}
        else{
            postOrderTraversal(localRoot.getLeftChild());
            postOrderTraversal(localRoot.getRightChild());
            System.out.print(localRoot.getData()+"-->");

        }
    }
    public void traversePreOrder(){
        preOrderTraversal(root);
    }
    public void traversePostOrder(){
        postOrderTraversal(root);
    }
    public void traverseinOrder(){
        inOrderTraversal(root);
    }
}
