package com.scannerexample;

// import java.util.Scanner;

// public class Solution {
    
//     public static void main(String[] args){

//         Scanner scn = new Scanner(System.in);

//         int num = scn.nextInt();
//         System.out.println("Int value = "+num);

//         double num2 = scn.nextDouble();
//         System.out.println("Double value = "+num2);


//         scn.close();

//     }
// }

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lenOfA = A.length();
        int lenOfB = B.length();
         char a = A.toUpperCase().charAt(0);
        char b = B.toUpperCase().charAt(0);
        System.out.println(lenOfA+lenOfB);
        if(lenOfA < lenOfB){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    //    System.out.print(a);
    //     for(int i=1;i<lenOfA;i++){
    //         System.out.print(A.charAt(i));
    //     }
    //     System.out.print(" "+b);
    //     for(int i=1;i<lenOfB;i++){
    //         System.out.print(B.charAt(i));
    //     }
         System.out.println(a+A.substring(1,A.length()) + " "+b+B.substring(1,B.length()));
         
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
