package com.grocery.controller;

public class TrailingZero {

    public  int trailingZeroes(int n) {

        if(n == 0) return 0;

        int count = 0;
        while(n >= 5){
            count += n / 5;
            n = n / 5;
        }

        return count;

    }

    public double fact(double n){
        if(n==1) return 1;

        return n*fact(n-1);
    }


    public static void main(String[] args) {
        TrailingZero t =new TrailingZero();
        System.out.println(t.trailingZeroes(32));
        System.out.println(t.fact(20));

    }
}
