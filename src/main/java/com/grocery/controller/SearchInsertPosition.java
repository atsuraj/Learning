package com.grocery.controller;

public class SearchInsertPosition {


    public static int searchInsert(int[] nums, int target) {

        int begin = 0;
        int last = nums.length-1;

        while(begin<=last){
            int mid = begin+(last-begin)/2;
            if(nums[mid]==target) return  mid;

            if(nums[mid]>target)
                last = mid-1;
            else
                begin = mid+1;

        }

        return  begin;
    }

    public static void main(String[] args) {
        int[] n = {1,3,5,7};
        System.out.println(SearchInsertPosition.searchInsert(n,8));
    }


}
