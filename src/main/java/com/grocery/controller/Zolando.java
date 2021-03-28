package com.grocery.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zolando {


    public static int solution(String s){

         List<Integer> a = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.substring(i+2)!= null) {
                count++;
                a.add(Integer.parseInt(s.substring(i, i + 2)));
            }

        }
        System.out.println("Count"+ count );
        Collections.sort(a);



        return Integer.parseInt(a.get(count-1).toString());
    }




    public static void main(String[] args) {
        System.out.println(Zolando.solution("45096879574847383738"));
    }
}
