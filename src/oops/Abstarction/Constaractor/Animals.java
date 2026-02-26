package oops.Abstarction.Constaractor;

abstract class Animals {
    Animals(){
        System.out.println("Animal constructor");

    }
    abstract void sound();

    }

class Dogs extends Animal{
    Dogs(){
        System.out.println("DOG CONSTRUCTOR");
    }
    void sound(){
        System.out.println("Barking");
    }
    }
    class constructor{
        static void main(String[] args) {
            Dogs d = new Dogs();
            d.sound();

        }
    }
