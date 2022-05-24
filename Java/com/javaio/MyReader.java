package com.javaio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyReader {
    public static void main(String[] args) {
        File cls = new File("read.txt");
        try {
            if(cls.exists()== false){
                System.out.println(cls.createNewFile());
                FileWriter fw = new FileWriter("read.txt");
                fw.write("Hi all!!!");
                Scanner myReader = new Scanner(cls);
                myReader.close();
                while(myReader.hasNextLine()){
                    String read = myReader.nextLine();
                    System.out.println(read);
                }
            }
            // System.out.println(cls.exists());
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("An error occured!");
        }
    }
}
