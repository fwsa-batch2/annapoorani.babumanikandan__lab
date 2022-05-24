package com.javaio;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) throws IOException{
        try {
            FileReader fr = new FileReader("//home//annapoorani//Desktop//Poorani.txt");
            // Scanner sc = new Scanner(fr);

            // while(sc.hasNextLine()){
            //     System.out.println(sc.nextLine());
            int a = fr.read();
            // while(a!=-1){
            //     System.out.println((char)a);
            //     a = fr.read();
            // }
            // }
            
        }

         catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
}
}