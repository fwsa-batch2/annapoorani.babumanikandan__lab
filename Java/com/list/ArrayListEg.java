package com.list;
import java.util.*;
public class ArrayListEg {
    public static void main(String[] args) {
      ArrayList <Integer> ar = new ArrayList<Integer>();

      ar.add(1);
      ar.add(12);
      ar.add(27);
      ar.add(27);
      // System.out.println(ar);
      for (Integer s : ar) {
        System.out.println(s);
      }

      ArrayList <Integer> ar1 = new ArrayList<Integer>();

        ar1.add(22);
        ar1.add(25);
        ar1.add(26);

        ar1.addAll(ar);
        for (Integer ar1value : ar1) {
          System.out.println(ar1value);
        }

        
    }
}
