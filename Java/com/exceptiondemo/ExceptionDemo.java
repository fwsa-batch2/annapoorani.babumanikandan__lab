package com.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a =10,b=0;
        int c=2;
        try {
            // int arr[]=null;
            // System.out.println(arr[1]);
            c = a/b;

            // double z=  (Double) null ;
            // System.out.println(z);
            
        }
         catch (ArithmeticException e) {
            //TODO: handle exception
            System.err.println("ArithmeticException error has Occured!");
        }
        catch (NullPointerException e) {
            //TODO: handle exception
            System.err.println("NullPointerException error has Occured!");
        }
        catch(Exception e){
            System.out.println("Error Occured!");
        }
        finally{
            System.out.println("This will print 'Finally' whatever happens");
        }

        // File file = new File("hello");
        // try (FileInputStream fs = new FileInputStream(file)) {
        // } 
        // catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        System.out.println(c);
        System.out.println("Thank you!");
    }
}
