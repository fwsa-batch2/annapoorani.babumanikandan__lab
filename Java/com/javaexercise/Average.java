package com.javaexercise;
import java.util.Scanner;;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no_");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no_");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd no_");
        int n3 =sc.nextInt();
        System.out.println("Enter 4th no_");
        int n4 = sc.nextInt();
        sc.close();

        int avg = (n1+n2+n3+n4)/4;
        System.out.println("The avg value is "+avg);


        // int num[] = {10,10,10,10};
        // int result =0;

        // for(int i=0;i<num.length;i++){
        //     result +=num[i];
            
            
        }
        // System.out.println("The avg value is "+result/num.length);
    }
// }
