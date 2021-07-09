package com.grocery.controller;

public class MaximunSubArray {

    public int maxSubArray(int[] nums) {

       int minValue = Integer.MIN_VALUE;
       int maxValue = 0;

        for (int i = 0; i < nums.length; i++) {
            maxValue+=nums[i];

            if (minValue<maxValue)
                minValue=maxValue;

            if (maxValue<0)
                maxValue=0;
        }
        return  minValue;
    }


    public static void main(String[] args) {

        MaximunSubArray m = new MaximunSubArray();
        int[] i = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(m.maxSubArray(i));
    }
}
