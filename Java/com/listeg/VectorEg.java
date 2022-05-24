package com.listeg;
import java.util.*;

public class VectorEg {
    public static void main(String[] args) {
        Vector <Integer> obj = new Vector<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        
        System.out.println(obj);

        System.out.println(obj.toString());

        // Iterator<Integer> iterator = obj.iterator();
        // System.out.print("Vector ");
        // while(iterator.hasNext()){
        //     System.out.print(iterator.next());
        //     System.out.print(", ");
        // }

        Object[] arr = obj.toArray();
        // System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        SortedSet<String> sorted_set = new TreeSet<>(); 
        sorted_set.add("hello");
        sorted_set.add("hello");
        System.out.println(sorted_set);
    }
}
