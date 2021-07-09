package com.grocery.controller;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if(word==null) return false;
        char[] ch = word.toCharArray();
        char temp =ch[0];
        if(ch.length==1) return  true;


        for(int i =1;i<ch.length;i++){

            int abs = Math.abs(temp - ch[i]);
            if(temp<=90 && ch[i]>=97 && i!=1) return false;

            if(temp>=97 && ch[i]<=90  )return false;

            temp= ch[i];

        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapital d = new DetectCapital();
        System.out.println(d.detectCapitalUse("VVXn"));
        System.out.println(d.detectCapitalUse("cZe"));
        System.out.println(d.detectCapitalUse("Amazon"));
        System.out.println(d.detectCapitalUse("waHaha"));
        System.out.println(d.detectCapitalUse("FlaG"));
        System.out.println(d.detectCapitalUse("Google"));
        System.out.println(d.detectCapitalUse("GOO"));
        System.out.println(d.detectCapitalUse("GGol"));
        System.out.println(d.detectCapitalUse("google"));
        System.out.println(d.detectCapitalUse("G"));
        System.out.println(d.detectCapitalUse("g"));
      //  if(temp<90 &&  Math.abs(temp-ch[1])<26) return false;

    }

}
