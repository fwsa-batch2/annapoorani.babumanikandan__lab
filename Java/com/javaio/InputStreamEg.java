package com.javaio;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class InputStreamEg {
    public static void main(String[] args) {
        try {
            InputStream obj = new FileInputStream("//home//annapoorani//Desktop//Poorani.txt");
            int i;
            while( (i=obj.read()) !=-1){
                System.out.println((char)i);
            }
            obj.close();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
