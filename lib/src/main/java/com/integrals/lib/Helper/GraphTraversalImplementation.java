package com.integrals.lib.Helper;

import com.integrals.lib.GraphTraversal;

import java.util.Scanner;

public class GraphTraversalImplementation {
    Scanner scanner;
    GraphTraversal graphTraversal;

    public GraphTraversalImplementation() {
        scanner=new Scanner(System.in);
    }

    public void implement(){
        System.out.print("\n Enter the total number of vertices ?");
        int size=scanner.nextInt();
        graphTraversal=new GraphTraversal(size);
        graphTraversal.enterGraph(size);

    }
}
