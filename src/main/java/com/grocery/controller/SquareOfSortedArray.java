package com.grocery.controller;

public class SquareOfSortedArray {


    public int[] sortedSquares(int[] nums) {

      /*  for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
*/
        return quicksort(nums, 0,nums.length-1);
    }

    public int[] quicksort(int arr[], int start, int end){

        int pivot = getPivot(arr, start, end);
        if(start<pivot -1)
            quicksort(arr,start,pivot-1);
        if (pivot<end)
            quicksort(arr,pivot,end);


        return arr;
    }

    public int getPivot(int[] arr,int start,int end){
        int pivot = arr[(start+end)/2];

        while (start<=end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void main(String[] args) {
        //int[] nums= {5,3,2,1};
        int[] nums= {4,10,1,6,5,4,9};
        SquareOfSortedArray s =new SquareOfSortedArray();
        System.out.println(s.sortedSquares(nums));


    }

}
