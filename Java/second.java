public class second {
    // x is the instance variable of file "First" 
    // Here we just created an object for "first" file to get the x variable in "second" file.
    public static void main(String [] args){
        first myObj = new first();
        System.out.print("Multiple classes value is "+myObj.x);
    }
}
