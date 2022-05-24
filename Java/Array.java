import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
       int [][]arr = {{10,11,12},{1,2,3},{4,5,6}};
       
    
       for(int i=0;i<arr.length;i++){

           System.out.println(Arrays.toString(arr[i]));
        // System.out.println(arr[i].length);
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   } 
}
 