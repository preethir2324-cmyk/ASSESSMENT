package oops.Abstarction.Interface.interface100not;

public interface Vechiles {
    default void stop(){
        System.out.println("STOPPED");
    }
}
class Cars implements Vechiles{
    public void simplemethod(){
        System.out.println("Simple car");
    }
}
class Bike  implements Vechiles{
    public void stop(){
        System.out.println("Bike  car");
    }
}
class Drivers{
    static void main() {
        Cars c = new Cars();
        c.stop();//1st way to acess the default method
        c.simplemethod();

        Vechiles v=new Cars();//upcasting
        v.stop();//2nd way to acess the default method

        Bike b=new Bike();
        b.stop();

    }

}
