package oops.GarbageCollection.ISlandofisolation;
//Island of Isloaction
public class Demo {
    Demo ref;
}
class Driver{
    static void main() {
        Demo d1=new Demo();
        Demo d2=new Demo();

        d1.ref=d2;
        d2.ref=d1;

        d1=null;
        d2=null;
    }
}
