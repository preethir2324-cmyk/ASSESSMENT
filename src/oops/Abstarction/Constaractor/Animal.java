package oops.Abstarction.Constaractor;
//abstarct class can have the static
abstract class Animal {
    static  void info(){
        System.out.println("information");
    }
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Dad{
    static void main() {
        Dog d=new Dog();
        d.sound();
        Animal.info();//without writing the object using the static
    }
}