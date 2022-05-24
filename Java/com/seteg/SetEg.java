package com.seteg;
import java.util.HashSet;
import java.util.*;
public class SetEg {
    public static void main(String[] args) {
        Set<String> n = new HashSet<String>() ;

        n.add("Poorani");
        n.add("Sangi");
        n.add("Vaishu");
        n.add("Maha");
        // System.out.println(n);
        n.remove("Poorani");
       n.clear();
       System.out.println(n.size());
        System.out.println(n);
    }
}
