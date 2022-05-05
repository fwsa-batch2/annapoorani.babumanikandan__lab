package com.opratorexamples;
public class ternaryOperator {
    public static void main(String[] args){
        int num1=50,num2=30,num3;
        num3=(num1==num2)? 80:20;
        System.out.println(num3);
        num3=(num2>num1)? 1:0;
        System.out.println(num3);
    }
}
