package com.grocery.controller;

public class ArrayTarget {
    static int x[] = new int[2];
    //static int y[] = new int[2];
    public  static int[] twoSum(int[] nums, int target) {



        return  getIndexes(nums,0,nums.length-1,target);
    }

    public static int[] getIndexes(int[] num,int num1,int num2,int target){
        if(num[num1]+num[num2]==target && num1 != num2 ){
            x[0] = num1;
            x[1] = num2;
            return x;
        }

        if (num2 ==0)
                return  getIndexes(num,num1+1,num.length-1,target);
            else
                return  getIndexes(num,num1,num2-1,target);


    }

    public static void main(String[] args) {
        int nums[] = {3,2,4};

        int nu[] =twoSum(nums,6);
        for (int i = 0; i < nu.length; i++) {
            System.out.println(nu[i]+" ");

        }

    }
}
