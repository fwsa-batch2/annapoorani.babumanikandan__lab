package com.list;
import java.util.*;
public class CalendarEg{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
    }
}