package com.integrals.lib;

import java.util.Scanner;

public class GraphTraversal {
    private String[] vertices;
    private int size;
    private Scanner scanner;
    private int[][] matrixGraph;

    public GraphTraversal( int size) {
        this.size = size;
        this.scanner=new Scanner(System.in);
        vertices=new String[size];
        this.matrixGraph=new int[size][size];
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
}
