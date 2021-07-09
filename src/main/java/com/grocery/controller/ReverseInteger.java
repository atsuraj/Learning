package com.grocery.controller;

public class ReverseInteger {

    @FunctionalInterface
    interface  AllRounder{

        public abstract int calculate(int x,int y);
    }

    public int reverse(int x) {
        int count = getCount(x,0);
       int sum = 0;
       // Maths  multipilcationNumber = (int s )->s+s;
       int mul =0;
       int count1 =count;
        for (int j = 1, g = count;j<=count1;j++,g--){
            mul = 1;
            while(g>j){
                mul = mul*10;
                g--;
            }
            sum += (x%10)* mul;
        }

        return sum;
    }

    public int getCount(int x,int count) {
        if(x/10==0){
            return count+1;

        }else
            return getCount(x/10,count+1);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(1234));
       // System.out.println(Math.multiplyExact(3,100));
    }
}
