package com.listeg;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEg {
    public static void main(String[] args) {
        
        ArrayList <String> arr = new ArrayList<String>();
        arr.add("Babu");
        arr.add("Poorani");
        arr.add("Charu");
        arr.add("23");

        // System.out.println(arr);
        
        // for (String  s : arr) {
        //     System.out.println(s);
            
        // }

        // for (int i = 0; i < arr.size(); i++) {
        //     System.out.println(arr.get(i));
        // }
        
        ///////////////////////////// REMOVE A ELEMENT FROM LOOPING /////////////////////////////////////
        
        Iterator<String> i = arr.iterator();
        String str = "";
        while(i.hasNext()){
            // System.out.println(i.next());
            str = i.next();
            if(str.equals("23")){
                i.remove();
                break;
            }
        }
        for (String  s : arr) {
                System.out.println(s);
                
            }
        // for (Iterator<String> i=arr.iterator();i.hasNext();) {
        //     System.out.println(i.next());
        // }
    }
}
