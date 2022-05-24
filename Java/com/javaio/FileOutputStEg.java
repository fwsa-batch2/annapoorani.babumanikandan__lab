package com.javaio;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class FileOutputStEg {
    
    public static void main(String[] args)  {
        
       
        FileOutputStream obj;
        try {
            obj = new FileOutputStream("//home//annapoorani//Desktop//Poorani.txt");
            
            
            String text = "Hi all! I'm Annapoorani";
            byte[] arr = text.getBytes();
            obj.write(arr);
            obj.close();
            System.out.println("success");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
    }
}
