package com.grocery.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        List l = list.stream().filter(integer -> integer%2==0 ).collect(Collectors.toList());
        System.out.println(l);
       List l1 =  list.stream().map(i->i%2==0 ? i+1 : i+2).collect(Collectors.toList());
        System.out.println(l1);

        List<Student> list1 = new ArrayList<>();
            list1.add(new Student("Kumar",2,"Katihar","Bihar"));
            list1.add(new Student("Himanshu",2,"Gorakhpur","Bihar"));
            list1.add(new Student("Suraj",2,"Katihar","UP"));
            List<Student> list2 = list1.stream().filter(student -> student.getState().equalsIgnoreCase("Bihar")).sorted((s1,s2)->(s1.getName().compareTo(s2.getName()))).collect(Collectors.toList());
            list2.stream().forEach(s-> System.out.println(s.getName()));



    }


}
