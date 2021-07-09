package com.grocery.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KDidd {

    public static void main(String[] args) {
      int[] nums = {1,3,1,5,4};int k = 0;
        System.out.println(findPairs(nums,k));
    }

    public static int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        Arrays.sort(nums);

        int counter = 0;

        int left = 0;
        int right = 0;

        HashSet<Integer> set = new HashSet<>();

        while (right < nums.length) {
            int s = nums[right] - nums[left];

            if (s == k && left != right && !set.contains(nums[right])) {
                counter++;
                set.add(nums[right]);

                left++;
                right++;
            } else if (s > k) {
                left++;
            } else {
                right++;
            }
        }

        return counter;

    }
}
