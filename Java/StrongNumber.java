public class StrongNumber {
   public static void main(String[] args) {
       int remainder,num = 145;
     
       int sum =0;
      int  temp = num;

       while(temp !=0){
        int fact=1;
        remainder = temp%10;
    // System.out.println(temp);
    //  System.out.println(remainder);
        for(int i=1;i<=remainder;i++){
            fact=fact*i;
            //  System.out.println(fact);
        }
        sum += fact;
        temp=temp/10;
       }
       
       if(temp==sum){
        System.out.println("The given number is strong number - "+sum);
       }
       else{
        System.out.println("The given number is not a strong number - "+sum);
       }
   } 
}
