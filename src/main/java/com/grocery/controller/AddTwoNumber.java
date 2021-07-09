package com.grocery.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoNumber {
    static ListNode  finalList =new ListNode();

     static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) {
             this.val = val;
         }
         ListNode(int val, ListNode next) {
             this.val = val; this.next = next;
         }
     }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0 && l2.val ==0)
            return new ListNode(0,null);

        String s1 = "";
        String oth = "";
        while (l1!=null){
            s1 +=(l1.val);

            l1 = l1.next;
        }
        String s2 = "";
        while (l2!=null){
            s2+=(l2.val);
            l2 = l2.next;
        }

        String toBeSum1 = "";
        for (int i = s1.length()-1; i >=0; i--)
            toBeSum1 += s1.charAt(i);
        String toBeSum2 = "";
        for (int i = s2.length()-1; i >=0; i--)
            toBeSum2 += s2.charAt(i);


        int total = 0;
        total = Integer.parseInt(toBeSum1)+Integer.parseInt(toBeSum2);


        System.out.println(toBeSum1 + " :: "+toBeSum2);
        System.out.println(total);

        String finalChar = String.valueOf(total);
        StringBuilder sb=new StringBuilder(finalChar);
        sb.reverse();

        System.out.println("final char : "+finalChar);


        return  returnResult(0, finalList,sb.toString());
    }

    private static ListNode returnResult(int i ,ListNode list, String outString) {
         if(i==0){
             finalList.val = Integer.parseInt(String.valueOf(outString.charAt(0)));
            if(outString.length()==1)
                return  finalList;
         }
        if(i==outString.length()-1) {
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(outString.charAt(i))), null);
            list.next = node;
            return  list;
        }else{
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(outString.charAt(i))), null);
            list.next = node;
            returnResult(i+1,list.next,outString);
        }


        return finalList ;
    }

    public static void main(String[] args) {
//

            ListNode listNode = new ListNode(5,null);
           // ListNode listNode1 = new ListNode(4,listNode);
          //  ListNode listNode2 = new ListNode(3,listNode1);
           // ListNode listNode3 = new ListNode(7,listNode2);
            ListNode lNode = new ListNode(5,null);
          //  ListNode lNode1 = new ListNode(6,lNode);
          //  ListNode lNode2 = new ListNode(4,lNode1);
           // ListNode lNode3 = new ListNode(4,lNode2);

            addTwoNumbers(listNode,lNode);

        long n = 66254935;

        long k = 1771862295;

        //28346751
        long output=0,curr= 0 , count =0;

        long countTemp = n;

        while(countTemp>0){
            count++;
            countTemp= countTemp/10;
        }
        long temp = (int) Math.pow(10,count-1);

        if(k>0)
        for(int i =1;i<=k;i++){
            curr = n%10;

            output = n /10 + curr*temp;
            n= output;

        }
        if(k<0) {

            for (long i = k; i <0 ; i++) {
                curr = n % temp;

                output = n / temp + curr * 10;
                n = output;

            }
        }
        System.out.println(output);

         }
}
