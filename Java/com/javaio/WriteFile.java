package com.javaio;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("//home//annapoorani//Desktop//Poorani.txt");
            fw.write("Hello world!");
            fw.append("I'm Annapoorani");
            fw.close();
            System.out.println("Successfully written");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
