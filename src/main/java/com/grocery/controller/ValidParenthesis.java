package com.grocery.controller;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s="(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {

        if(s.length()<2) return  false;
        char[] ch = s.toCharArray();
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(ch[i]=='('){
                open.push(i);
            }else if(ch[i]=='*'){
                star.push(i);
            }else{
                if(!open.empty()){
                    open.pop();
                }else if(!star.empty()){
                    star.pop();
                }else return false;
            }
        }

       while (!open.isEmpty()){
           if(!star.empty() && open.peek()<star.peek()){
                   open.pop();
                   star.pop();

           }else return  false;
       }


    return  true;
    }

}
