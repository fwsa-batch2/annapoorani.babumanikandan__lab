
public class average {
   public static void main(String [] args){
       int i;
       int num[] = {1,2,3,4,5,6,7};
      

       int result=0;
       for(i=0;i<=num.length;i++){
           result+= num[i];
        
       }
       System.out.println(result/num.length);
     }  
}

// System.out.println(num[i]);