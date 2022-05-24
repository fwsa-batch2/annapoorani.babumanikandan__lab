package com.multithreads;

public class MultiThreadsEg extends Thread {
    public void run(){
        System.out.println("Hello from MultiThreadsEg ");

    }
    public static void main(String[] args) {
       MultiThreadsEg obj1 = new MultiThreadsEg();
       mulEg obj = new mulEg();

       System.out.println("Welcome to java");
        obj1.start();
        obj.start();
  
    }
}

 class mulEg extends Thread {
    public void run(){
        System.out.println("Hello from mulEg");

    }
}

 