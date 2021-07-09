package com.grocery.controller;

import java.util.ArrayList;
import java.util.List;

public class PthFactorElement {

    public static  long pthFactor(long n, long p){

        long count =1;
        int flag =0;
        long x =1;
        for (long i = 2; i <= n;) {
            if (n % i == 0){
                if(flag == 0){
                    x =i;
                    flag =1;
                }
                count++;
                System.out.println(i);

            }
            if(flag ==0){
                i++;
            }else{
                i=i*x;
            }
            if(count == p){
                return i;
            }
        }
        return 0;

    }



    public static void main(String[] args) {
        System.out.println( "\n Element is :"+pthFactor(10,3));
        System.out.println( "\n Element is :"+pthFactor(22876792454961l,28));

    }


}
