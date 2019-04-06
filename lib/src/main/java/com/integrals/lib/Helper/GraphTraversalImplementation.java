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
        System.out.print("Starting Node ?");
        String d=scanner.next();
        System.out.print("\n\nBreadth first Search\n");
        graphTraversal.breadthFirstSearch(d);
        System.out.print("\n\nDepth first Search\n");
        graphTraversal.depthFirstSearch(d);
    }
}
