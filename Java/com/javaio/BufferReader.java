package com.javaio;
import java.io.*;

public class BufferReader {
    public static void main(String[] args) {

        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        try {
            // System.out.println("Enter the string :");
        
            // String str = br.readLine();
            // System.out.println("Your string is "+str);
            // System.out.println("Enter an Integer :");
            // int a = Integer.parseInt(br.readLine());
            // System.out.println("Your Integer is "+a);
            System.out.println("Enter the float value :");
            // float b= Float.valueOf(br.readLine()).floatValue();
            float b = Float.parseFloat(br.readLine());
            System.out.println(b);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }}