package com.grocery.controller;

import java.util.*;

public class DeletionCount {

    static  int tempCount = 0;
    static int countOfDelete;
    static  HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();

    public  static  int countDelete(String s){


            char[]  charArray = s.toCharArray();

            for (char c : charArray){
                if (hashMap.containsKey(c)){
                    hashMap.put(c,hashMap.get(c)+1);
                }else{
                    hashMap.put(c,1);
                }

            }

            HashSet<Integer> hashSet = new HashSet<>();
        for (Map.Entry<Character,Integer> h1 : hashMap.entrySet()) {
            countOfDelete = noCountdelete(h1.getValue(), hashSet);
        }


        return  countOfDelete;
    }

    public static  int noCountdelete(int i, Set<Integer> s1 ){

            if(s1.contains(i)) {
                tempCount= tempCount+1;
                noCountdelete(i-1,s1);

            }else {
                s1.add(i);
                //break;
            }

        return  tempCount;
    }

    public static void main(String[] args) {
        System.out.println("Answer: "+countDelete("aaaaabbbbccccceeff"));
    }




}
