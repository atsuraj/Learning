package com.grocery.controller;

interface Calculation{
    public abstract int add(int x,int y);

}

class Test {


    Test(){
        System.out.println("I am Test.");
    }

    public static int addition(int x,int y){
        return x+y;
    }

    Calculation i1 = Test::addition;
    int i = i1.add(6,7);

    public static void main(String[] args) {
        Runnable r = ()->{

            for (int i =0;i<=10;i++){
              //  Thread.currentThread().setName("Suraj"+i);
            System.out.println("Thread is started..."+Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }};


        Runnable r1 = r::run;

        Calculation i = Test::addition;
        System.out.println(i.add(6,5));
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r);
        thread.start();
        thread1.start();

    }
}
