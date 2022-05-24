package com.list;

import java.io.*;
import java.util.*;



    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the nuber");
           int num = sc.nextInt();
           String s = Integer.toString(num);
           System.out.println(s);
           if( num<=100 || num<=-100 ){
               if(num==Integer.parseInt(s)){
               System.out.println("Good job");}
               else{
                   System.out.println("Wrong answer");
               }
           }
        //    else{
               
        //    }
            
        }
    }
