package com.grocery.controller;

import java.util.*;
import java.util.function.Predicate;


interface Maths{

    public  abstract int calculate(int x);
    default void myFun1(){

    }
    default void myFun2(){

    }
}
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
            countOfDelete = noCountDelete(h1.getValue(), hashSet);
        }

        //
        return  countOfDelete;
    }

    public static  int noCountDelete(int i, Set<Integer> s1 ){

            if(s1.contains(i)) {
                tempCount= tempCount+1;
                noCountDelete(i-1,s1);

            }else {
                s1.add(i);
            }

        return  tempCount;
    }

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup().getName());
                    System.out.println("Thread Group : "+Thread.currentThread().getThreadGroup().getParent().getName());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            System.out.println("Lamda called");
        }).start();

        System.out.println("Answer: "+countDelete("aaaaabbbbccccceeff"));


        int i = 5;

        Maths m = (int s )->s+s;

       int a =  m.calculate(i);
        System.out.println("Addition : "+a);
         m = (int s )->s*s;

         a =  m.calculate(i);
        System.out.println("Multiplication : "+a);

        String  name = "Kumar Suraj";
        Predicate<String> p = s -> s.contains("S");
        
        System.out.println("Predicates "+p.test(name));

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);

        a1.forEach(n -> System.out.println(n));
        
    }



}
