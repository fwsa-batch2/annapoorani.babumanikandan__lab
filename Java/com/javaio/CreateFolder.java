package com.javaio;
import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
       File file = new File("//home//annapoorani//Desktop//FolderDemo//FolderDemo1//FolderDemo2");
      boolean present= file.exists();
       System.out.println("Folder Created : "+present);

       if(present==false){
        file.mkdirs();
        System.out.println("Folder Created : "+present);
       }

    // If the file path is crt then the canExcute() returns true;
       if(file.canExecute()){
        System.out.println("Excutable!");
       }
       else{
           System.out.println("Not excutable!");
       }
        
    }
}
