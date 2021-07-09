package com.grocery.controller;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequnce {


    public int findNumberOfLIS(int[] nums) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0 ; i < nums.length-1; i++) {

            if(nums[i]<nums[i+1]){
                list.add(i);
                list.add(i+1);
            }

            if (!(nums[i]>nums[i+1]))
                list1.add(nums[i]);



        }


        return 0;
    }

    public static void main(String[] args) {
LongestIncreasingSubsequnce l = new LongestIncreasingSubsequnce();
int[] i = {1,3,5,4,7};
l.findNumberOfLIS(i);
    }
}
