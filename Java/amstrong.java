import java.util.Scanner;


public class amstrong{
    public static void main(String[] args) {
        int input,temp,remainder,result=0;

        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        temp = input;
        while(temp!=0){
            remainder = temp%10;
            
            result +=Math.pow(remainder, 3);
            temp/=10;
            // System.out.println(temp);
        }
        sc.close();
        if(result==input){
        System.out.println(input+" is Amstrong value");}
        else{
            System.out.println(input+" is not a Amstrong value");}
        }
    }
// }