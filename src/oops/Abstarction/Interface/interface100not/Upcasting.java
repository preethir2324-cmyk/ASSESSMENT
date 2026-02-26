package oops.Abstarction.Interface.interface100not;

public interface Upcasting {
    void sound();

}
class inner implements Upcasting{
public void sound() {
    System.out.println("hi");
}
}
class Deiver{
    static void main() {
        Upcasting u=new inner();
        u.sound();
    }
}
