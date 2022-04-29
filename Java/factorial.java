public class factorial {
    public static void main(String [] args) {
       
        int i;
        int fact=1;
        int num =7;

        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial =" +fact);
    }
    
}

// public class factorial{
//     public static void main(String[] args){
//         int i;
//         int fact=1;
//         int num=25;

//         for(i=1;i<=num;i++){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//     }
// }