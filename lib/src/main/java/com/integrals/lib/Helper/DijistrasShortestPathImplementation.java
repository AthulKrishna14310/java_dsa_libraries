package com.integrals.lib.Helper;

import com.integrals.lib.DijkstrasAlgorithm;

import java.util.Scanner;

public class DijistrasShortestPathImplementation {
    Scanner scanner;
    DijkstrasAlgorithm dijkstrasAlgorithm;

    public DijistrasShortestPathImplementation() {
        scanner=new Scanner(System.in);

    }

    public void implement(){
        System.out.print("\n Enter the total number of vertices ?");
        int size=scanner.nextInt();
       dijkstrasAlgorithm=new DijkstrasAlgorithm(size);
       dijkstrasAlgorithm.enterGraph(size);
       dijkstrasAlgorithm.shortestPath();

    }
}
