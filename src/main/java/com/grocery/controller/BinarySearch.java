package com.grocery.controller;

public class BinarySearch {

    public int search(int[] nums, int target) {
        if(nums==null) return -1;

        return binarySearch(nums,target,0,nums.length-1);
    }

    public int binarySearch(int nums[],int target,int start, int end){
        int mid= (start+end)/2;

        int data = nums[mid];
        if(data ==target) return mid;

        if(start<end){
            if(data<target) return binarySearch(nums,target,mid+1,end);
            if(data>target) return binarySearch(nums,target,start,mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {-1,0,3,5,9,12};
        BinarySearch b = new BinarySearch();
        System.out.println(b.search(n,9));
            String str = "cbafg";
        System.out.println(str.substring(3));
    }
}
