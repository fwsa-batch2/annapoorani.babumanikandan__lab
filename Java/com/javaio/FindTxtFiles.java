package com.javaio;
import java.io.File;
public class FindTxtFiles {
    public static void main(String[] args) {
        
        File file = new File("//home//annapoorani//Desktop");

        File[] listOfFiles = file.listFiles();
        for (File f : listOfFiles) {
            if(f.isFile()){
                System.out.println(f.getName());
            }
           
        }
    }
}
