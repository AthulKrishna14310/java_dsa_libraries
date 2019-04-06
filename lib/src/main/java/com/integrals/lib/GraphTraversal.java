package com.integrals.lib;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GraphTraversal {
    private String[] vertices;
    private int size;
    private Scanner scanner;
    private int[][] matrixGraph;
    private String[] connectedVertices;
    private Queue<String> stringQueue;
    private String[] visitedVertices;
    private  Queue<String> tempQueue;
    private Stack<String> stringStack;
    private int DFS=101;
    private int BFS=102;
    private Stack<String> visitedStack;

    public GraphTraversal( int size) {
        this.size = size;
        this.scanner=new Scanner(System.in);
        this.vertices=new String[size];
        this.matrixGraph=new int[size][size];
        this.connectedVertices=new String[size];
        this.stringQueue=new LinkedList<>();
        this.visitedVertices=new String[size];
        this.tempQueue=new LinkedList<>();
        this.stringStack=new Stack<>();
        this.visitedStack=new Stack<>();
    }

    public String[] getVertices() {
        return vertices;
    }

    public void setVertices(String[] vertices) {
        this.vertices = vertices;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    private void enterVertices(int size){
        for(int i=0;i<size;i++){
            print("Enter the vertex (Should be a charachter name) "+(i+1)+" :");
            vertices[i]=scanner.next();
        }

    }

    private void displayMatrix(int size){
        print("\n"+"   ");
        for (int i=0;i<size;i++){
            print(vertices[i]+"  ");
        }
        print("\n");
        for (int i=0;i<size;i++){
            print(vertices[i]);
            for (int j=0;j<size;j++){
                print(" "+i+""+j);
            }
            print("\n");
        }

    }

    private void enterMatrix(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                print("Value at "+i+""+j+" :");
                matrixGraph[i][j]=scanner.nextInt();
                }
            print("\n");
        }
    }

    private void displayMatrixRepresentation(int size){
        print("\n"+"  ");
        for (int i=0;i<size;i++){
            print(vertices[i]+" ");
        }
        print("\n");
        for (int i=0;i<size;i++){
            print(vertices[i]);
            for (int j=0;j<size;j++){
                print(" "+matrixGraph[i][j]);
            }
            print("\n");
        }
    }

    public void enterGraph(int size){
        enterVertices(size);
        displayMatrix(size);
        enterMatrix(size);
        displayMatrixRepresentation(size);
    }

    private void print(String ch){
        System.out.print(ch);
    }

    public void addConnectedVertices(String initial,int mode){
        if(mode==BFS) {
            int k = 0;
            int index = 0, i = 0;
            try {
                for (i = 0; i < vertices.length; i++) {
                    if (initial.contentEquals(vertices[i])) {
                        break;
                    }
                }

            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            index = i;

            for (int j = 0; j < vertices.length; j++) {
                if (matrixGraph[j][index] == 1) {
                    connectedVertices[k] = vertices[j];
                    k++;
                }

            }
            for (int x = 0; x < k; x++) {
                if (stringQueue.contains(connectedVertices[x])) {
                    // do nothing
                } else {
                    if (tempQueue.contains(connectedVertices[x])) {

                    } else {
                        stringQueue.add(connectedVertices[x]);
                        print(" , " + connectedVertices[x]);
                    }
                }

            }


        }else if (mode==DFS) {
            int i=0;
            int index;
            int k=0;
            try {
                for (i = 0; i < vertices.length; i++) {
                    if (initial.contentEquals(vertices[i])) {
                        break;
                    }
                }

            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            index = i;


            for (int j = 0; j < vertices.length; j++) {
                if (matrixGraph[j][index] == 1) {
                    connectedVertices[k] = vertices[j];
                    k++;
                }

            }


            for(int j=0;j<k;j++)
            {
                if(visitedStack.contains(connectedVertices[j])){

                }else{
                    if(!stringStack.contains(connectedVertices[k])) {
                        stringStack.push(connectedVertices[j]);
                        print(" , "+stringStack.peek());
                    }

                }
            }

        }


    }



    public void breadthFirstSearch(String start) {
          stringQueue.add(start);
          print(start);
          while(!stringQueue.isEmpty()) {
              start=stringQueue.peek();
              addConnectedVertices(start,BFS);
              tempQueue.add(stringQueue.peek());
              stringQueue.remove();

            }
        }


    public void depthFirstSearch(String start){
           stringStack.push(start);
           print(start);
            while (!stringStack.isEmpty()){
                visitedStack.push(stringStack.peek());
                addConnectedVertices(start,DFS);
                start=stringStack.peek();
                stringStack.pop();
           }

    }
}
