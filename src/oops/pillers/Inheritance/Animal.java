package oops.pillers.Inheritance;

public class Animal {
    void eat(){
        System.out.println("Eatting");
    }
}
class Lion extends Animal{
    public void roar(){
        System.out.println("Rouring");
    }
}
class dog{
    static void main() {
        Animal a=new Animal();
        a.eat();
        Lion l=new Lion();
        l.roar();
    }
}