package com.integrals.lib.Helper;

import com.integrals.lib.Dijstras_ShortestPath;

import java.util.Scanner;

public class DijistrasShortestPathImplementation {
    Scanner scanner;
    Dijstras_ShortestPath dijstras_shortestPath;

    public DijistrasShortestPathImplementation() {
        scanner=new Scanner(System.in);
    }

    public void implement(){
        System.out.print("\n Enter the total number of vertices ?");
        int size=scanner.nextInt();
        dijstras_shortestPath=new Dijstras_ShortestPath(size);
        dijstras_shortestPath.enterGraph(size);
        dijstras_shortestPath.addConnectedVertices("A");


    }
}
