package com.grocery.controller;

import java.util.Arrays;

public class FindTwoElementSum {


    public static void main(String[] args) {
        int a[] ={2,7,11,15};
        int num = 9;
        for (int x: getIndex(num,a) ) {
            System.out.print(x+" ");
        }
    }


    public static  int[] getIndex(int num,int a[]){
         int pos[] = new int[2];
        Arrays.fill(pos,-1);
            for (int i = 0; i<a.length;i++){
                if(pos[0]!= -1 && pos[1] != -1)
                    return pos;
                else {
                    pos = findNumber(num - a[i], a, i+1, pos);
                    pos[0] = i;
                }

            }
        return pos;
    }

    public static int[] findNumber(int num,int a[],int j,int pos[]){
        for(int i = j;i<a.length;i++){
            if(a[i]==num){
                pos[1]=i;
                return pos;

            }

        }
       return  pos;
    }


}
