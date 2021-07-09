package com.grocery.controller;

import java.util.Stack;

public class Test123 {

    public static boolean judgeCircle(String moves) {

        char[] step = moves.toCharArray();
        int forLeftRight =0;
        int forUpDown =0;

        for(int i = 1;i<=step.length-1;i++){
            char ch =step[i];
            if(ch=='L')
                forLeftRight++;
            else if(ch=='R')
                forLeftRight--;
            else if(ch=='U')
                forUpDown++;
            else
                forUpDown--;

        }

        return (forLeftRight==0 && forUpDown==0);


    }
    public static void main(String[] args) {
        System.out.println(judgeCircle("UDD"));

    }
}
