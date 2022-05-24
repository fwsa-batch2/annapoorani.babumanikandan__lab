package com.javaio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Createfile {
    public static void main(String[] args) throws IOException  {
      
        File file = new File("//home//annapoorani//Desktop//Poorani.txt");
        try {
            if(file.createNewFile()){
                System.out.println(file.getCanonicalPath());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("File not created");
        }
        System.out.println(file.exists());
        
            file.mkdir();
           
    }

}
