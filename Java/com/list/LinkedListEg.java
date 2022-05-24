package com.list;

import java.util.LinkedList;

public class LinkedListEg {
    public static void main(String[] args) {
        LinkedList <String> ll=new LinkedList<>();
        ll.add("Poorani");
        ll.add("Sangeetha");
        ll.add("Sangeetha");
        ll.add("Rishi");

        for(String l:ll){
            System.out.println(l);
        }
    }
}
