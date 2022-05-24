package com.scannerexample;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    //              NEXTLINE()
    System.out.println("Enter your text : ");
    String text = obj.nextLine();
    System.out.println("The text is "+text);


    //               NEXTBYTE()
    System.out.println("Enter your age!");
    byte age = obj.nextByte();
    System.out.println("The age is "+age);


    //               NEXTINT()
    System.out.println("Please enter your Phone number!");
    int phoneNo = obj.nextInt();
    System.out.println("The phone number is "+phoneNo);


    //               NEXT()
    System.out.println("Enter your name : ");
    String name = obj.next();
    System.out.println("The name is  "+name);


    //             nextBoolean()
    System.out.println("Are you 18+?");
    boolean bn = obj.nextBoolean();
    System.err.println("The age is "+ bn);

    obj.close();

    }
}
