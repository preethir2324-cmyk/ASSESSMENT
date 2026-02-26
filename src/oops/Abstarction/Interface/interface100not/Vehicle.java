package oops.Abstarction.Interface.interface100not;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Engine stop");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi ready to start");
    }
}
class Rolysroy implements Vehicle{
    public void start(){
        System.out.println("Rolsroy ready to start");
    }
}
class Bmw implements Vehicle{
    public void start(){
        System.out.println("bmw ready to start");
    }
}
class Driver{
    static void main() {
        Audi c1= new Audi();
        c1.start();
        c1.stop();
        Rolysroy c2=new Rolysroy();
        c2.start();
        c2.stop();
        Bmw c3 =new Bmw();
        c3.start();
        c3.stop();

    }
}