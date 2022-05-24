package com.listeg;
import java.util.*;
public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<String>();
        // arr.ensureCapacity(2);
        arr.add("Poorani");
        arr.add("Monkey");
        arr.add("Prasanna");
        System.out.println(arr.size());
        System.out.println(arr.contains("Poorani"));

        String name = arr.get(2);
        System.out.println(name);

        arr.set(1,"Sangeetha" );
        arr.remove(1);
        // arr.add(12);
        // arr.add('A');
        // arr.add(true);
        System.out.println(arr);

        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        System.out.println(arr.clone());
        System.out.println(arr.isEmpty());
        System.out.println(arr.indexOf("Sangeetha"));
        arr.trimToSize();
        System.out.println(arr);
        //
        for(String i:arr){
            System.out.println(i);
        }
        

    }
}
