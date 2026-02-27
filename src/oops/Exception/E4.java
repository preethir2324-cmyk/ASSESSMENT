package oops.Exception;

public class E4 {
    static void main() {
        try {
            int blance = 2000;
            int withdraw = 3000;
            if (withdraw > blance) {
                throw new RuntimeException("Insufficent blance:");
            }
            System.out.println("Withdraw sucessful");
        }catch (ArithmeticException e){
            System.out.println("Exception Caught:"+e.getMessage());
        }
    }
}
