package com.cBank;

import com.bank.*;

public class centralBank {
    public static void main(String[] args){
        Bank obj1 = new Bank();
        
// We can't achieve the Default,Private and Protected variables.

        // System.out.println("Default var is "+obj1.ifsc);
        // System.out.println("Private var is :"+obj1. accNo);
        System.out.println("Public var is "+obj1.misc);
        // System.out.println("Protected var is "+obj1.mobNo);
    // }
    
}
}
class stateBank extends Bank {
    public static void main(String[] args){
        stateBank obj1 = new stateBank();

        // System.out.println("Default var is "+obj1.ifsc);
        // System.out.println("Private var is :"+obj1. accNo);
        System.out.println("Public var is "+obj1.misc);
        System.out.println("Protected var is "+obj1.mobNo);
    }
}