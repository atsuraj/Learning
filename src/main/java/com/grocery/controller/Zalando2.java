package com.grocery.controller;

import java.util.*;

public class Zalando2 {


    public int solution(String s){

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int count =0;
            if(hashMap.containsKey(letter)) {
                count = hashMap.get(letter);
                hashMap.put(letter,count+1);
            }else
                hashMap.put(letter,1);
        }


        Set<Integer> set = new HashSet<>();
        int count =0;

       for (Map.Entry hMap : hashMap.entrySet()){

           int key = (int) hMap.getValue();
           while (set.contains(key) && key!=0) {
               key--;
               count++;
           }
           set.add(key);
        }

       if(count==0) return 0;

        return count;
    }


    public static void main(String[] args) {
            Zalando2 z = new Zalando2();
        System.out.println(z.solution("aaabbbcc"));
       // Arrays
        /*int input = 123;
        int res = 0;
        while (input!=0) {

            res = res * 10 + input % 10;
            input /=10;

        }

        return res;*/





    }
}
