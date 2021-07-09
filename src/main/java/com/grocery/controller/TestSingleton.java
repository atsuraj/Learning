package com.grocery.controller;

public class TestSingleton {

    private  static  TestSingleton testSingleton = null;

    private TestSingleton(){

    }

    public static TestSingleton getTestSingleton() {
        if(testSingleton==null)
       synchronized (TestSingleton.class){
           if(testSingleton==null)
               return  new TestSingleton();
       }

        return testSingleton;
    }

    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        a+=b;
        //a=a+b;
        System.out.println(a);
    }

}
