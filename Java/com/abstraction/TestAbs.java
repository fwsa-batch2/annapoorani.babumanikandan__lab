package com.abstraction;

// Here the "shape" is the abstract class
// By Using abstraction, we can achieve the "Multiple Inheritance"
abstract class shape{
  abstract void draw();
  
}

public class TestAbs {
    public static void main(String[] args) {
        // System.out.println("test");
        circle crl = new circle();
        crl.draw();
        rectangle rec = new rectangle();
        rec.draw();
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Draw Circle!");
    }
   
}

class rectangle extends shape{
    void draw(){
        System.out.println("Draw Rectangle!");
    }
}