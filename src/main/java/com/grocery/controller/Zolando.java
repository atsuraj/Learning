package com.grocery.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Zolando {


    public static int solution(String s){

        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.substring(i+2)!= null) {
                int temp = Integer.parseInt(s.substring(i, i + 2));
                if(temp>maxCount)
                maxCount = temp;
            }

        }



        return maxCount;
    }




    public static void main(String[] args) {
        System.out.println(Zolando.solution("45096879574847383738"));
    }
}
