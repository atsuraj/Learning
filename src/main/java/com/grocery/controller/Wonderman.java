package com.grocery.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Wonderman {




    public static String reverseWords(String s) {

        String[] ch = s.split(" ");

        String results = ch[ch.length-1];

        for (int i = ch.length-2; i >=0 ; i--) {
            if(ch[i].length()>0)
            results = String.join(" ", results, ch[i]);
        }

        return results;
    }

    public static int maxProduct(int[] nums) {

        if(nums.length==1) return nums[0];

        int max = nums[0];
        int prdTemp = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            int temp = Math.max(Math.max(nums[i], nums[i]*max),max);
            if(temp>max) {
                if(max>prdTemp){
                   prdTemp  = max;
                    max =nums[i];
                }
            }
            else
                max =nums[i];


        }

        return  prdTemp;
    }


    public static void main(String[] args) {
        //System.out.println(Wonderman.reverseWords("th\"e sky is blue"));
        int[] n = {2,3,-2,4};
        System.out.println(Wonderman.maxProduct(n));
    }
}
