package com.string;

public class StringMethods {
    public static void main(String[] args) {

        // charAt()
        // Returns the character at the specified index (position)
        String name = "Poorani";
        char result = name.charAt(6);
        System.out.println(result);

        // compareTo()
        // The compareTo() method compares two strings lexicographically.
        // if s1==s2    - returns 0
        // if s1< s2    - returns negative
        // if s1> s2    - returns positive
        String text ="Hello";
        String text1 = "Hello";

        int res = text.compareTo(text1);
        System.out.println(res);


        // The compareToIgnoreCase() method compares two strings lexicographically,
        //  ignoring lower case and upper case differences.
        String txt = "Poorani";
        String txt1 = "poorAnI";
        System.out.println(txt.compareToIgnoreCase(txt1));

        // concat()
        String name1 ="Anna";
        System.out.println(name1.concat("Poorani"));

        // contains()   -- returns = true or false
        String t = "Hello world!";
        System.out.println(t.contains("ello"));
        System.out.println(t.contains("hi"));

        // contentEquals()
        // The contentEquals() method searches a string to find out 
        // if it contains the exact same sequence of characters in the specified string or StringBuffer.
        String myStr = "Hello";
        System.out.println(myStr.contentEquals("Hello"));
        System.out.println(myStr.contentEquals("e"));
        System.out.println(myStr.contentEquals("Hi"));

        // copyValueOf()
        // The copyValueOf() method returns a String that represents the characters of a char array.
        // This method returns a new String array and copies the characters into it.
        char [] str1 ={'P','O','O','R','N','I'};
        String str2 ="";
        str2 = String.copyValueOf(str1,0,3);
        System.out.println(str2);
    }
}
