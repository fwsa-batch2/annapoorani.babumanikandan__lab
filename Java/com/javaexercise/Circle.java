package com.javaexercise;

public class Circle {
    static double radius = 7.5;
    public static void main(String[] args){
        
        double perimeter = 2*Math.PI*radius;
        // double area = Math.PI*radius*radius;
        double area = Math.PI*Math.pow(radius,2);
        System.out.println(perimeter);
        System.out.println(area);
    }
}
