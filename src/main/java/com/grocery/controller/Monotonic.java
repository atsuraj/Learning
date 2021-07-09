package com.grocery.controller;

public class Monotonic {

    public static boolean isMonotonic(int[] nums) {

        if(nums.length==0) return true;
        boolean incflag =true;
        boolean decflag =true;


        if(nums.length>2)
            for (int j = 0; j < nums.length-1; j++) {
                if(!(nums[j]>=nums[j+1] )){
                    decflag =  false;
                }
                if(!(nums[j]<=nums[j+1])){
                    incflag =  false;
                }

            }

        return incflag|| decflag;
    }



    public static void main(String[] args) {
        int[] i = {6,3,1,0,7};
        System.out.println(Monotonic.isMonotonic(i));
    }
}
