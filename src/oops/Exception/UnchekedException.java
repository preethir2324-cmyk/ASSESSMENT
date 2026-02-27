package oops.Exception;

public class UnchekedException {
    static void main() {
        int i, j, k = 0;
        i = 10;
        j = 2;

        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
       } catch (ArithmeticException e) {
            System.out.println("Undefined");
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
            } catch (Exception e) {
            System.out.println("Unkown expection occured ");
        }finally{
            System.out.println("This will execute no matter what!");
        }
        System.out.println("Hello");
        }static {//not part of exception handeling ececute first
        System.out.println("Execution first");
    }

}
