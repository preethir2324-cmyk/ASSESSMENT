package oops.Abstarction.demo;

abstract  class Animal {
     static void Ass() {
    }

    abstract void sound();
       static void run(){
        System.out.println("Running");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Roar");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Meow");

    }
}
class Drivers{
    static void main() {
        Lion l=new Lion();
        l.sound();
        Cat c=new Cat();
        c.sound();
        Animal.run();//static key word
    }
}