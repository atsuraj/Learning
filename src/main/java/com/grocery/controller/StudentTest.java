package com.grocery.controller;

import java.util.HashSet;

public class StudentTest {

    String name;
    int age;

    public StudentTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        StudentTest c1= new StudentTest("John",20);
        StudentTest c2= new StudentTest("John",20);
        HashSet<StudentTest> customerSet=new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);


        System.out.println(customerSet.size());

    }
}
