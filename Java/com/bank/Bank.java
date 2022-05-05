package com.bank;
public class Bank {
   
    int ifsc = 10011 ;
    private int accNo = 1223441213;
    public int misc=20427;
    protected int mobNo =952341567;

    public void main(String[] args){

        Bank obj1 = new Bank();

        
        System.out.println("Default var is "+obj1.ifsc);
        System.out.println("Private var is :"+obj1. accNo);
        System.out.println("Public var is "+obj1.misc);
        System.out.println("Protected var is "+obj1.mobNo);

        
    }
}

class Bank1 extends Bank{
    public void main(String[] args){
        Bank obj2 = new Bank();
        System.out.println("Default var is "+obj2.ifsc);
        // System.out.println("Private var is :"+obj2. accNo);
        System.out.println("Public var is "+obj2.misc);
        System.out.println("Protected var is "+obj2.mobNo);

    }   


}

class Bank2 {
    public static void main(String[] args){
        
        Bank obj3 = new Bank();
        
        System.out.println("Default var is "+obj3.ifsc);
        // System.out.println("Private var is :"+obj3. accNo);
        System.out.println("Public var is "+obj3.misc);
        System.out.println("Protected var is "+obj3.mobNo);
    }
}