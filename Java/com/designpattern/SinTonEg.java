package com.designpattern;

public class SinTonEg {
    public static void main(String[] args) {
        SingleTonEg sinObj1 = SingleTonEg.getInstance();
        SingleTonEg sinObj2 = SingleTonEg.getInstance();
        // SingleTonEg sinObj3 = new SingleTonEg();
        sinObj1.print();
        sinObj2.print();
    }
}
