package oops.Abstarction.Interface;

public interface Animal {
    void sound();//abstract method
    void run();//abstract method

    }
     class Lions implements Animal{
     public void sound(){//should specify the public
             System.out.println("ROAR");
         }
         public void run(){
             System.out.println("Animal");
         }
     }
     class dog {
         static void main() {
             Lions l=new Lions();
             l.sound();
             l.run();
         }
     }