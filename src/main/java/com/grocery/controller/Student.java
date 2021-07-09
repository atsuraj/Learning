package com.grocery.controller;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Student  {
    private String name;
    private int roll;
    private String city;
    private String state = new String();

    public Student(String name, int roll, String city, String state) {
        this.name = name;
        this.roll = roll;
        this.city = city;
        this.state = state;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public static void main(String[] args) {
        String s ="";
        Integer i = new Integer(0);
        s+= i;
        System.out.println();
    }

}
