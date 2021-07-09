package com.grocery.controller;

public class KthMissingPosNumber {


    public  int findKthPositive(int[] arr, int k) {

        int temp =1;
        int pos =0;
        int lastElement = arr[arr.length-1];
        int missArr[] = new int[1000];
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=temp){
                missArr[pos]=temp;
                temp++;
                pos++;
            }
            temp++;
        }

        for (int i = pos; i < missArr.length; i++) {
            missArr[i]=lastElement+1;
            lastElement++;
        }
        return missArr[k-1];
    }

    public static void main(String[] args) {
        int n[] = {1,2,3,4};
        KthMissingPosNumber k = new KthMissingPosNumber();
        System.out.println(k.findKthPositive(n,2));
    }
}
