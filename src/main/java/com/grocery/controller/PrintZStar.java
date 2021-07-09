package com.grocery.controller;

import java.util.Scanner;

public class PrintZStar {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        if(input==1) System.out.println("prime");

        for(int i=2;i<Math.sqrt(input);i++){
            if(input%i==0) {
                System.out.println("not prime");
                break;
            }
            else System.out.println(" prime");
        }

        for(int i =0;i<5;i++)
            System.out.print("*");
        System.out.println();
        for(int i =1;i<4;i++){
            for(int j=i;j<4;j++)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }

        for(int i =0;i<5;i++)
            System.out.print("*");
    }
}
