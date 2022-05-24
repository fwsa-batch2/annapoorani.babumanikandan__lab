package com.designpattern;

public class SingleTonEg {
    
    private static SingleTonEg singleTon ;

    private SingleTonEg(){}

    public static SingleTonEg getInstance(){

        if(singleTon==null){
            singleTon = new SingleTonEg();
        }
        return singleTon;
        

    }

    public static void print(){
        System.out.println("Hi I'm from SingleTonEg class");
    }
}
