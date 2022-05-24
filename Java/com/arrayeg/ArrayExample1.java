package com.arrayeg;

public class ArrayExample1 {
    public static void main(String[] args){

        int number[] = {1,2,3,4,5};


        // for(int i=0;i<number.length;i++){
        //     System.out.println(number[i]);
        // }
        for (int i : number) {
            System.out.println(i);
        }
    }
}
