package com.inheritance;

// Single Inheritance 

//  mobile is the parent class / base class
//  samsung is the child class /  derived class

// Multilevel Inheritance
//  mobile - parent class, samsung - intermediatory class and realMe - child class

// Hierarchical Inheritance
//  mobile - parent class ;  micromax , samsung - child class 


 public class mobile {
    public void camera(){
        System.out.println("Please Smile from mobile!");
    }

    public static void main(String[] args){

        samsung s = new samsung();
    // s.camera();
   s.camera();
   
    //     micromax m = new micromax();
    // m.camera();
    // m.ringtone();

    //    realMe r =new realMe();
    // r.camera();
    // r.flash();
    }
    
}


 class samsung extends mobile{
     
    public void camera(){
        System.out.println("Please Smile from samsung!");
    }
    public void flash(){
        System.out.println("chik chik from samsung!!!");
    }
    
}

class micromax extends mobile{
    public void ringtone(){
        System.out.println("Hello Sweety I'm calling from micromax!!!");
    }
}

class realMe extends samsung{
    public void ringtone(){
        System.out.println("Hello Sweety I'm calling from realme!!!");
    }
}

