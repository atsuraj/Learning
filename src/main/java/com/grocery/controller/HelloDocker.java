package com.grocery.controller;

import java.util.ArrayList;
import java.util.List;

public class HelloDocker {


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        // Arrays.sort(nums);
        backtrack(result,new ArrayList<>(), nums,0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){

        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i+1);

            // tempList.remove(tempList.size()-1);
        }
        result.add(new ArrayList<>(tempList));


//nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    }

    public static void main(String[] args) {
        HelloDocker helloDocker  = new HelloDocker();
        int a[] = {1,2,3};
        System.out.println(helloDocker.subsets(a));
    }
}
