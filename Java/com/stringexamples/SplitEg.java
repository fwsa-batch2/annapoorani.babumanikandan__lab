package com.stringexamples;

public class SplitEg {
    public static void main(String[] args){

        String s ="Welcome all and happy to see you frds";
        String arr[]= s.split(" ",7);
        for(String result : arr){
        System.out.println(result);
    
        // Expected output is 
        // "Welcome
        // all
        // and
        // happy
        // to
        // see
        // you frds"
    }
    }
}
