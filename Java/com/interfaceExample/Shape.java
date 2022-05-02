package com.interfaceExample;
interface drawable{
    void draw();
}

class circle implements drawable{
    public void draw(){
        System.out.println("Draw a circle!");
    }
}
class triangle implements drawable{
    public void draw(){
        System.out.println("Draw a triangle!");
    }
}
public class Shape {

    public static void main(String[] args){
        circle crl = new circle();
        crl.draw();

        triangle tri = new triangle();
        tri.draw();
    }
}
