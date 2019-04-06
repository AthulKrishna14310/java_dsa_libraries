package com.integrals.lib.Helper;

import com.integrals.lib.PostFixConversion;

import java.util.Scanner;

public class PostFixConversionImplementation {
    private String expression;
    private Scanner scanner;
    private PostFixConversion postFixConversion;
    public PostFixConversionImplementation() {
        scanner=new Scanner(System.in);
    }

    public void implement(){
        System.out.println("Enter the expression ?");
        expression=scanner.next();
        expression="("+expression+")";
        postFixConversion=new PostFixConversion(expression);
        postFixConversion.convert();
    }

}
