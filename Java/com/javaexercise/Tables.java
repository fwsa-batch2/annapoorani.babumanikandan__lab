package com.javaexercise;
import java.util.Scanner;;
public class Tables {
    
        public static void main(String[] args){
          // int num=8; 
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number!");
          int num = sc.nextInt();
          sc.close();
          
          for(int i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
          }
        } 
      
}
