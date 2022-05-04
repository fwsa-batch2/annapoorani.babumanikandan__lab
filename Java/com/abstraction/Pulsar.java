package com.abstraction;

// Here bike is the abstract class
// Then "Pulsar" extends the "bike"(abstract class)
// Calling the abs method "run()" in main method.
abstract class bike{
  abstract void run();
}
public class Pulsar extends bike {
  
    void run() {
        // TODO Auto-generated method stub
        System.out.println("Go Fast!!!");
    }
    
    public static void main(String[] args){
        Pulsar pls = new Pulsar();
        pls.run();

        honda hon = new honda();
        hon.run();
    }

    
    }
    class honda extends bike{
        void run(){
            System.out.println("Run fastly!");
        }
    }

