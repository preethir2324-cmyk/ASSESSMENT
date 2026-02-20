package Method;

public class Swap {
    static  void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.printf("before a=%d,b=%d", a, b);
        Swap.swap(10, 20);
        System.out.printf("After a=%d,b=%d", a, b);
    }
}

