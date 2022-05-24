package com.constructor;

public class ConstructorEg {
   String a;
    int b;
    int m;

    // String s ="String";
    ConstructorEg(){
        System.out.println("Hello");
    }
    ConstructorEg(String i,int b){
       a=i;
       this.b=b;
        System.out.println(run());

       
    }
    String run(){
        System.out.println("run!");
       String v="hellooooooooo";
        return v;
    }
  public static void main(String[] args) {
    
 ConstructorEg obj = new ConstructorEg();
 System.out.println(obj.m+","+obj.b+","+obj.a);

 ConstructorEg obj1 = new ConstructorEg("hi",13);

 System.out.println(obj1.a+","+obj1.b);

  }  
}
