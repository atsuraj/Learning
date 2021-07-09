package com.grocery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Sample{

    Sample(){
        System.out.println("Sample Cons");
    }
    Sample(String s){
        System.out.println("Sample Cons "+s);
    }
}

interface Interf{

    public Test get();
}

public class Test1 {


    public static void main(String[] args) {

        Interf i = Test::new;
        i.get();


        List<String> list = new ArrayList<>();
        list.add("Suraj");
        list.add("Alex");
        list.add("Rohit");
        list.add("Jack");
        list.add("Suraj");

        list.stream().forEach(s-> System.out.print(s+" "));

        System.out.println("******");
        List l1 = list.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        l1.stream().forEach((s)-> System.out.print(s+" "));


    }


}
