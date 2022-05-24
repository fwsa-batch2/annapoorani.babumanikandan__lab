package com.javaio;
import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        File file = new File("//home//annapoorani//Desktop//FolderDemo//create_fileDemo.txt");
        boolean present = file.exists();
        System.out.println(present);
        // Get the file name
        System.out.println("File name is "+ file.getName());

        // To create a file
        try {
            file.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File is not created");
            e.printStackTrace();
        }

        // Rename a file
        File newFile = new File("//home//annapoorani//Desktop//FolderDemo//newName.txt");
        boolean rename = file.renameTo(newFile);
        System.out.println("renamed file : "+rename);
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        
      

        // To list all the folders and files in the desktop
        File file1 = new File("//home//annapoorani//Desktop");
        // String[] listOfFoldersFiles = file1.list();
        // for(String f:listOfFoldersFiles){
        //     System.out.println(f);
        // }


        // To list all the files in the desktop
        File[] listOfFiles = file1.listFiles();
            for (File f : listOfFiles) {
                
                if(f.isFile()){
                    System.out.println(f);
                }
            }
        
        // To list the folders in the desktop
        File[] listOfFolders = file1.listFiles();
        for (File fl : listOfFolders) {
            if(fl.isDirectory()){
                System.out.println(fl);
            }
        }


        // file.delete();
        // System.out.println("File present: "+present);
    }
}
