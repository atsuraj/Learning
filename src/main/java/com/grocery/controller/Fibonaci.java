package com.grocery.controller;

import java.math.BigInteger;
import java.util.Arrays;

public class Fibonaci {



 /*   public static void main(String[] args) {
        int n = 500;
        int a[] = new int[n+1];
        Arrays.fill(a,-1);
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        System.out.println(getFibonaci(n,a));
        for (int b: a
             ) {
            System.out.print(b +" ");
        }
    }*/

    public static void main(String[] args) {
        System.out.println(getLargeFib(500));
    }


    public  static BigInteger getLargeFib(int n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int i = 2;i<n;i++){
            c = a.add(b);
            a=b;
            b=c;
        }
        return  b;
    }

    public static int getFibonaci(int n,int a[]){
        int fib = Integer.MAX_VALUE;
        if(n==0) return  0;
        if (n==1 || n==2) return  1;
        if(a[n]!=-1){
            fib = a[n];
        }
        fib = getFibonaci(n-1,a)+getFibonaci(n-2,a);

        return a[n]=fib;
    }

}
