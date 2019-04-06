package com.integrals.lib;

import java.util.Scanner;

public class Dijstras_ShortestPath {
    private String[] vertices;
    private Scanner scanner;
    private int[][] matrixGraph;
    private int size;
    private String[] connectedVertices;
    private int[]    weights;
    private int shortestPath;
    private String shortestNode;

    public Dijstras_ShortestPath(int size) {
        this.size = size;
        vertices = new String[size];
        scanner = new Scanner(System.in);
        matrixGraph = new int[size][size];
        connectedVertices = new String[size];
        weights=new int[size];
    }

    private void enterVertices(int size) {
        for (int i = 0; i < size; i++) {
            print("Enter the vertex (Should be a charachter name) " + (i + 1) + " :");
            vertices[i] = scanner.next();
        }

    }

    private void displayMatrix(int size) {
        print("\n" + "   ");
        for (int i = 0; i < size; i++) {
            print(vertices[i] + "  ");
        }
        print("\n");
        for (int i = 0; i < size; i++) {
            print(vertices[i]);
            for (int j = 0; j < size; j++) {
                print(" " + i + "" + j);
            }
            print("\n");
        }

    }

    private void enterMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                print("Value at (this is weight of graph )" + i + "" + j + " :");
                matrixGraph[i][j] = scanner.nextInt();
            }
            print("\n");
        }
    }

    private void displayMatrixRepresentation(int size) {
        print("\n" + "  ");
        for (int i = 0; i < size; i++) {
            print(vertices[i] + " ");
        }
        print("\n");
        for (int i = 0; i < size; i++) {
            print(vertices[i]);
            for (int j = 0; j < size; j++) {
                print(" " + matrixGraph[i][j]);
            }
            print("\n");
        }
    }

    public void enterGraph(int size) {
        enterVertices(size);
        displayMatrix(size);
        enterMatrix(size);
        displayMatrixRepresentation(size);
    }

    private void print(String ch) {
        System.out.print(ch);
    }

    public void addConnectedVertices(String initial) {
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
            if (matrixGraph[j][index]> 0) {
                connectedVertices[k] = vertices[j];
                weights[k]=matrixGraph[j][index];
                k++;
            }

           }

           findShortestPath(weights);
           findNode(initial,shortestPath);

        }

        public void findShortestPath(int[] array ){
        shortestPath=array[0];
        for(int i=0;array[i]!=0;i++){
            if(array[i]<shortestPath){
                shortestPath=array[i];
            }

        }



      }


      public void findNode(String initial,int weight){
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

             for(int j=0;j<vertices.length;j++){
                 if(matrixGraph[index][j]==shortestPath){
                     shortestNode=vertices[j];
                 }
             }

             print(shortestNode);
       }

    }
