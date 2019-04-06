package com.integrals.lib;

import java.util.EmptyStackException;
import java.util.Stack;

public class PostFixConversion {
    private Stack<Character> stack;
    private String result;
    private String expression;

    public PostFixConversion(String expression) {
        this.expression=expression;
        this.stack=new Stack<>();
        this.result="";
    }

    private int priority(char ch){
        switch (ch){

            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

                default:
                    return 0;
         }
       }

    public void convert(){

         for(int i=0;i<expression.length();i++){
             char ch=expression.charAt(i);


             if(Character.isLetterOrDigit(ch)){
               addToResult(ch);
               continue;
             }

             else if(ch=='('){
                 pushtoStack(ch);
                 continue;
             }

             else if(ch==')'){
                  while ((stack.peek()!='(')&&!stack.isEmpty()) {
                    result+=stack.pop();
                  }
                  stack.pop();
             continue;
             }

             else  {
                 operandEncountered(ch);
                 continue;
              }


            }
           while (!stack.isEmpty()){
             result+=stack.pop();
             }


            System.out.print(result);
    }


    private void operandEncountered(char ch) {
        while(priority(ch)<=priority(stack.peek()))
            result+=stack.pop();
        stack.push(ch);
    }

    private void pushtoStack(char ch) {
          stack.push(ch);
    }

    private void addToResult(char ch) {
       result+=ch;
    }

}
