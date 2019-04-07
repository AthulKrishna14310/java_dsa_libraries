package com.integrals.lib;


import java.util.Scanner;

public class DijkstrasAlgorithm  {
   private String[] vertices;
   private int[][]   matrixGraph;
   private int size;
   private Scanner scanner;

    public DijkstrasAlgorithm(int size) {
        this.size = size;
        this.matrixGraph=new int[size][size];
        this.vertices=new String[size];
        this.scanner=new Scanner(System.in);
    }

    public void dijkstraShortestPath(int[][] adjacencyMatrix){
        int v=adjacencyMatrix.length;
        boolean visited[]=new boolean[v];
        int distance[]=new int[v];
        distance[0]=0;
        for(int i=1;i<v;i++){
            distance[i]=Integer.MAX_VALUE;
        }

        for(int i=0;i<v-1;i++){
            int minVertex=findMinimumVertex(distance,visited);
            for(int j=0;j<v;j++){
                if(adjacencyMatrix[minVertex][j]!=0&&!visited[j]&&distance[minVertex]!=Integer.MAX_VALUE){
                    int newDistance=distance[minVertex]+adjacencyMatrix[minVertex][j];
                    if(newDistance<distance[j]){
                        distance[j]=newDistance;
                    }
                }
            }
        }

       for(int i=0;i<v;i++){
            System.out.println(i+""+distance[i]);
       }
    }

    public void shortestPath(){
        dijkstraShortestPath(matrixGraph);
    }

    private int findMinimumVertex(int[] distance, boolean[] visited) {
        int minVertex=-1;
        for(int i=0;i<distance.length;i++){
            if(!visited[i]&&(minVertex==-1||distance[i]<distance[minVertex]))
                minVertex=i;
        }
     return minVertex;
    }
    public void enterGraph(int size) {
        enterVertices(size);
        displayMatrix(size);
        enterMatrix(size);
        displayMatrixRepresentation(size);
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

    private void print(String ch) {
        System.out.print(ch);
    }
}
