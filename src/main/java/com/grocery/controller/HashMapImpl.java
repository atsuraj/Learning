package com.grocery.controller;

import java.util.HashMap;

public class HashMapImpl {


    public static void main(String[] args) {
        HashMap<String,Long> hashMap = new HashMap<String,Long>();


        System.out.println("size: "+hashMap.size());
        System.out.println(hashMap.get("a"));
    }
}
