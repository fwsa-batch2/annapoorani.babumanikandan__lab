package com.interfaceExample;

interface schoolFee{
    double fee( double f);
}

class xyz implements schoolFee{
    public double fee( double f){
        return f;
    }
}

class abc implements schoolFee{
    public double fee(double f){
        return f;
    }
}
public class School {
    public static void main(String[] args) {
        xyz scl = new xyz();
       double xyzFee = scl.fee(1200.00);
        System.out.println("The school fee of xyz is "+xyzFee);

        abc shl = new abc();
        double abcFee = shl.fee(15000.122);
        System.out.println("The school fee of abc is "+abcFee);
    }
}
