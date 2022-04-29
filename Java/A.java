public class A {
   // a parameterized constructor  
A(int x, int y)  
{  
    System.out.println(x+" "+y); 
}  
  
void foo()  
{  
  System.out.println("Inside the foo method of base class.");    
}  

}
// child or derived class  
class B extends A  
{  


B(int x, int y) {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

void foo()  
{  
  System.out.println("Inside the foo method of derived class.");    
}  
}  
  
 class CouplingExample1  
{  
  
// main method   
public static void main(String argvs[])   
{  
// creating an object of class B  
B obj = new B(1,2);  
obj.foo();  
}  
}   

