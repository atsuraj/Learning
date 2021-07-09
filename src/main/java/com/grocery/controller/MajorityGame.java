package com.grocery.controller;

import java.util.*;

public class MajorityGame {

    public  int majorityElement(int[] nums) {


        if(nums.length ==0) return 0;
        if(nums.length ==1) return nums[0];

        HashMap<Integer,Integer> hmap = new HashMap();

        for(int i=0;i<=nums.length-1;i++){
            int temp = nums[i];
            if(hmap.containsKey(temp)) {
                hmap.put(temp, hmap.get(temp) + 1);
                if(hmap.get(temp)>nums.length/2)
                    return nums[i];
            }
            else
                hmap.put(temp,1);
        }



        return 0;

       /* HashMap<Integer,Integer> hmap = new HashMap();

        for(int i=0;i<=nums.length-1;i++){
            int temp = nums[i];
            if(hmap.containsKey(temp))
                hmap.put(temp,hmap.get(temp)+1);
            else
            hmap.put(temp,1);
        }

        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer,Integer> h1: hmap.entrySet()) {
            if(maxValue<h1.getValue()) {
                maxValue = h1.getValue();
                maxKey = h1.getKey();
            }
        }*/



    }

    public static void main(String[] args) {
        int nums[] = {2,1,1};
        MajorityGame m = new MajorityGame();
        System.out.println(m.majorityElement(nums));
    }

}
