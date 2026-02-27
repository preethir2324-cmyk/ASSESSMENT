package oops.Exception;

public class E3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible acess granted");
        }
        else{
            throw new RuntimeException("Not Eligible-Acess Denied! ");
        }
    }
    public static void main() {
      checkAge(12);
      //checkAge(25);
    }
}
