// import java.util.Scanner;
// import java.lang.*;
public class Reverse {
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer("Annapoorani");
        sb.reverse();
        System.out.println(sb);
        // System.out.println("inaroopanna");

        String name = "Annapoorani";
        // System.out.println(name.length());
        int len=name.length();
        for(int i=len-1;i>=0;i--){
            
            System.out.print(name.charAt(i));

        }
        

    }
}
