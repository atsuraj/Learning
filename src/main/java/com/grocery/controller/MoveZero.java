package com.grocery.controller;

public class MoveZero {

    public int[] moveZeroes(int[] nums) {
        int count = 0;
        int zeroCount = nums.length;
        int res[] = new int[nums.length];

        for (int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
               nums[count] = nums[i];
               count++;
            }
            else
                zeroCount--;
            /* int temp = swap2;
                nums[swap2] = nums[i];
                nums[i]=temp;
                swap2--;*/
        }
        for (int i =zeroCount;i<nums.length;i++){
            nums[i]=0;
        }


        return nums;
    }


    public static void main(String[] args) {
        MoveZero m = new MoveZero();
        int[] i = {0,1,0,3,12};
        System.out.println(m.moveZeroes(i));
    }
}
