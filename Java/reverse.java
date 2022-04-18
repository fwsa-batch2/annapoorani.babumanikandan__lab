public class reverse {
    public static void main(String [] args){
        int num=92749,reversedNum=0;
        System.out.println(num);
        while(num!=0){
           int remainder = num % 10;
            reversedNum = (reversedNum*10)+remainder;
           
            num=num/10;
        }
        System.out.println(reversedNum);
    }
}
