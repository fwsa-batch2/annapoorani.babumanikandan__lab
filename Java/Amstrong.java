import java.util.Scanner;;
public class Amstrong {
   public static void main(String[] args) {
       
    int input,remainder,temp,result=0;
    Scanner sc = new Scanner(System.in);
    input = sc.nextInt();
    temp = input;
    while(temp!=0){
        remainder = temp%10;
        result+=Math.pow(remainder, 3);
        temp/=10;
        // System.out.println(temp);
    }
    if(result == input){
        System.out.println("Amstrong val is "+input);
    }
    else{
        System.out.println("Not a amstrong val is "+input);
    }
sc.close();
   } 
}

