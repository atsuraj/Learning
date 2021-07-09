package com.grocery.controller;

public class RemoveDuplicateSortArray {

    public int removeDuplicates(int[] nums) {
       int count = 0;
        if(nums.length==0) return 0;


        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[count]) {
                count++;
                nums[count]=nums[i];

            }

        }
        return count+1;
    }


    public static void main(String[] args) {
        RemoveDuplicateSortArray r = new RemoveDuplicateSortArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeDuplicates(nums));
    }
}
