package com.javaio;
import java.io.File;
import java.io.IOException;
public class RenameFile {
   public static void main(String[] args) {
       File file = new File("//home//annapoorani//Desktop//school//class.txt");
      System.out.println(file.exists());
       File renameFile = new File("//home//annapoorani//Desktop//school//12th.txt");
       boolean renaming = file.renameTo(renameFile);
       System.out.println("renaming the file : "+renaming);
   } 
}
