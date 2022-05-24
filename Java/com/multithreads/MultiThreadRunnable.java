package com.multithreads;

public class MultiThreadRunnable {
    
    public void run(){
        System.out.println();
    }

    public static void main(String[] args) {
       
        Thread obj = new Thread(new MultiThreadsEg());
        Thread guruThread1 = new Thread("Guru1");
        guruThread1.start();
        // System.out.println(guruThread1.getName());

        // obj.start();
        // System.out.println(obj.getName());
    }
}


