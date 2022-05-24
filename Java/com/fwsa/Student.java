// package com.fwsa;
// public class Student {
//     private static String email;
//     private static String password;

//     public String getEmail(){
//         return email;
//     }
//     public  String setEmail(String emailId){
//         Student.email=emailId;
//         return email;
//     }
//     public String getPass(){
//         return password;
//     }
//     public  String setPass(String password){
//         Student.password=password;
//         return password;
//     }
//     public static void main(String[] args){
//         Student fwsaStudent = new Student();
//        String fwsaStud = fwsaStudent.setEmail("EmailId is " + "Poorani@fwsa.FreshWorks.com");
//         System.out.println(fwsaStud);

//         Student studPassword = new Student();
//         String fwsaStudPass = studPassword.setPass("Password is "+"P00r@ni");
//         System.out.println(fwsaStudPass);
//     }
// }


package com.fwsa;
public class Student{
    private String email;
    private String password;

    public String getEmail(){
        return email;
    
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPass(){
        return password;
    
    }
    public void setPass(String pass){
        this.password = pass;
    }


    public static void main(String[] args){

        Student studCrdn = new Student();

        studCrdn.setEmail("Poorani@fwsa.FreshWorks.com");

        studCrdn.setPass("P00r@ni");

        System.out.println(studCrdn.getEmail());
        System.out.println(studCrdn.getPass());


    }

}

