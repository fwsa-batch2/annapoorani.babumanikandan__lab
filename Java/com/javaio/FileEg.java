package com.javaio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileEg {
    public static void main(String[] args) {
        
        // file.exists();
        // System.out.println(file.exists());
        // file.mkdir();
        // System.out.println(file.mkdir());

        File file = new File("demo.txt");
        try {
            
            if(file.exists() == true){
            //     System.out.println(file.createNewFile());
                FileWriter myWriter = new FileWriter("demo.txt");
                myWriter.write("Hello everyone! Welcome to the java world!!! ");
                myWriter.close();
            }
            else{
                System.out.println("Can't create a file bcx it already existed!");
            }



        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("An error occured!");
        }

    }
}
