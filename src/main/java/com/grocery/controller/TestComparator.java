package com.grocery.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparator implements Comparator<Student> {


    public static void main(String[] args) {

        Movie m = new Movie("Baby",7.5);

        Movie m1 = new Movie("ST",4.5);
        Movie m2 = new Movie("By",9.5);

        ArrayList<Movie> listM = new ArrayList<Movie>();
        listM.add(m);
        listM.add(m1);
        listM.add(m2);

        Collections.sort(listM);

        for (Movie movie: listM   ) {
            System.out.println(movie.getName()+" "+movie.getRating());
        }




        Student s = new Student("Kumar Suraj",1,"Noida","Bihar");
        Student s1 = new Student("Himanshu",3,"Delhi G","U.P");
        Student s3 = new Student("Himanshu",2,"Delhi F","U.P");
        Student s2 = new Student("Suraj",3,"Faizabaad","U.P");

        List<Student> list =  new ArrayList<Student>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);

      Collections.sort(list,new TestComparator());
        for (Student l1: list) {
            System.out.println(l1.getName()+" "+l1.getRoll()+" "+l1.getCity()+" "+l1.getState());
        }

    }


    @Override
    public int compare(Student o1, Student o2) {
        int rollValue = o1.getRoll()- o2.getRoll();
        int nameValue = o1.getName().compareTo(o2.getName());
        return (nameValue==0) ? rollValue : nameValue;
    }
}
