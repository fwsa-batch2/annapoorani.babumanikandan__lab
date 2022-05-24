package com.multithreads;

public class ThreadEg implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Hello ");
        
    }

    public static void main(String[] args) {
        
        Thread tobj = new Thread(new ThreadEg());
        Thread oobj = new Thread(new ThreadEg1());
        tobj.start();
        oobj.start();
        System.out.println("Printing Started");
        for( int i=0;i<=10;i++){
            System.out.println("Printing from main method #"+i);
        }

    }
    
}

class ThreadEg1 extends Thread {
    public void run(){
        for( int i=0;i<=10;i++){
            System.out.println("Printing from ThreadEg1 ^"+i);
        }
    }
}
