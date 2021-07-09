package com.grocery.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

enum Cl{

}
public class SepiantTest {

    public static void main(String[] args) {

        String[] s = {"4","13","5","/","+"};
        evalRPN(s);

    }
    public static int evalRPN(String[] tokens) {
        int firstVal=0;
        int nextVal=0;
        int operation = 0;
        Stack<String> stack = new Stack<String>();
        for(int i =0;i<tokens.length;i++){
            if(!(tokens[i].equals("*") || tokens[i].equals("+")
                    || tokens[i].equals("/") ||
                    tokens[i].equals("-")) ){
                stack.push(tokens[i]);}
            else{
                firstVal= Integer.parseInt(stack.pop());
                nextVal= Integer.parseInt(stack.pop());
                switch (tokens[i]){
                    case "*":
                    {
                        operation =nextVal*firstVal;
                        stack.push(String.valueOf(operation));
                    }
                    break;
                    case "/":
                    {
                        operation =nextVal/firstVal;
                        stack.push(String.valueOf(operation));
                    }
                    break;
                    case "+":
                    {
                        operation =nextVal+firstVal;
                        stack.push(String.valueOf(operation));
                    }
                    break;
                    case "-":
                    {
                        operation =nextVal-firstVal;
                        stack.push(String.valueOf(operation));
                    }
                    break;
                    default:
                    {

                    }

                }

            }
        }
        return Integer.parseInt(stack.pop());

    }
}
