package oops.Exception;

public class E2 {
    static void main() {
        int i,j,k=0;
        i=10;
        j=2;//0 ArithematicException //*2 Array Index OUT OF BOUND EXCEPTION
        try{
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
