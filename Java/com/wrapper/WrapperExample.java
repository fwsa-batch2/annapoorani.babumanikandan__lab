package com.wrapper;

public class WrapperExample {
    public static void main(String[] args){
        // BOXING
        // int a = 27;          
        // Integer valueOfA= Integer.valueOf(a);
        // System.out.println("The boxed value is "+valueOfA);

        // boolean married = false;
        // Boolean valueOfBool = Boolean.valueOf(married);
        // Boolean valueOfBool = married;
        // System.out.println("The boxed boolean value is "+valueOfBool);

        // UNBOXING

        Integer num = new Integer(10);
        int n = num.intValue();
        // int n = num;
        System.out.println("The Unboxed 'Interger' value is "+n);

        Character gen = new Character('F');
        // char g = gen.charValue();
        char g = gen;
        System.out.println("The unboxed 'Character' value is "+g);

    }
}
