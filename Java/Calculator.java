public class Calculator{
    
    public static void main(String[] args){
        int addition = add(12,13);
        int subraction = sub(12,13);
        int multiplication = mul(2,3);
        float division = div(10,5);
        float  modulo = div(50,5);
       
        System.out.println("The added value is " + addition);
        System.out.println("The subracted value is"+subraction);
        System.out.println("The multiplied value is "+multiplication);
        System.out.println("The divided value is "+ division);
        System.out.println("The divided value is "+  modulo);

    }
    public static int add(int num1,int num2){
       int add = num1+num2;
      int result = add;
      return result;
       
    }
    public static int sub(int num1, int num2){
        int sub =num1-num2;
        int result = sub;
        return result;
    }
    public static int mul(int num1, int num2){
        int mul= num1*num2;
        int result = mul;
        return result;
    }
    public static float div(int num1, int num2){
        int div= num1/num2;
        int result = div;
        return result;
    } 
    public static float modulo(int num1 , int num2){
        int modulo = num1%num2;
        int result = modulo;
        return result;
    }






