package com.wrapper;

public class WrapperExample {
    public static void main(String[] args){

        // { BOXING }

        int a = 27;          
        Integer valueOfA= Integer.valueOf(a);
        System.out.println("The boxed value is "+valueOfA);

        boolean married = false;
        // Boolean valueOfBool = Boolean.valueOf(married);               old method
        Boolean valueOfBool = married;
        System.out.println("The boxed boolean value is "+valueOfBool);

        // { UNBOXING }

        // Integer num = new Integer(10);                                 old method
        // int n = num.intValue();
        Integer num = 20;
        int n = num;
        System.out.println("The Unboxed 'Interger' value is "+n);

        // Character gen = new Character('F');
        Character gen = 'F';
        // char g = gen.charValue();                                       old method
        char g = gen;
        System.out.println("The unboxed 'Character' value is "+g);


        //  { STRING TO INTEGER }

        
        String number = "123456";
        int no = Integer.parseInt(number);
        System.out.println("The value converted from string to integer "+no);


        //  { STRING TO BOOLEAN }
        String name ="true";
        boolean b = Boolean.getBoolean(name);
        System.out.println(b);

         //  { STRING TO CHARACTER }

        // String gender ="M";
        // char gnd = Character.toChars(gender);
        // System.out.println(gnd);

    }
}
