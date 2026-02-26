package oops;

public class Car {
    String BrandName;
    int Manudate;
    String Color;
     public Car (String BName,int Manudate,String Color){// can skip the attribute of it is null
         BrandName=BName;//intesd of this keyword
         this.Manudate=Manudate;
         this.Color=Color;
    }
    void printDetailes(){
        System.out.printf("Car Brand name is %s\n",BrandName);
        System.out.printf("Car manudate is %d\n",this.Manudate);
        System.out.printf("Car Color %s\n",this.Color);
    }
}

class  Driver{
    static void main() {
        Car c1 = new Car("Audi", 2000, "red");
        Car c2 = new Car("BMW", 3000, "green");
        c1.printDetailes();
        c2.printDetailes();
    }
}
