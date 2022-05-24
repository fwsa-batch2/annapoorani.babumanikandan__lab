package com.string;
import java.util.*;;
public class StringEg {
    public static void main(String[] args) {
        // System.out.println("abc");
        // String cde = "cde";
        // System.out.println("abc" + cde);
        // String c = "abcdef".substring(1,4);
        // System.out.println(c);
        // String d = cde.substring(1, 2);
        // System.out.println(d);
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lenOfA = A.length();
        int lenOfB = B.length();
         char a = A.toUpperCase().charAt(0);

        char b = B.charAt(0);
        System.out.println(a+" "+b);
        System.out.println(lenOfA+lenOfB);
        if(lenOfA < lenOfB){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        // }
       
         System.out.println(a+A.substring(1) + " "+b+B.substring(1));
         
        ;
    }}}
