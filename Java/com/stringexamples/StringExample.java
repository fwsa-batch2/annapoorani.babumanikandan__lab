package com.stringexamples;

//// Small eg for String ////
public class StringExample {
    public static void main(String[] args){
        String alp = "abcd";
        System.out.println("String value is "+alp);

        char[] alpha ={'a','b','c','d'};
        String newStr = new String(alpha);
        System.out.println("Char value is " + newStr);
    }
}
