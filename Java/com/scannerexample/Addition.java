package com.scannerexample;
import java.util.Scanner;;
public class Addition {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter first number");
    int fn = scn.nextInt();
    
    System.out.println("Enter second number");
    int sn = scn.nextInt();
    
    int sum = fn+sn;
    System.out.println("The value is "+sum);
    
    scn.close();
}
    
}
