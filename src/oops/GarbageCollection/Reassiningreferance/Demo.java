package oops.GarbageCollection.Reassiningreferance;

public class Demo {
    static void main() {
        Demo d1=new Demo();
        Demo d2=new Demo();
        d1=d2;
    }
}
