package oops.Abstarction.demo;

import oops.Student;

abstract class Students {
    String name;
    Students(){// the constructor
        name="preethi";
    }
    abstract void study();
     static void Ass(){
        System.out.println("Assignment");
    }
}
class Run extends Students{
    void study(){
        System.out.println("Studing");
    }
}
class Write extends Students{
    void study(){
        System.out.println("writting");
    }
}
class Pen{
    static void main() {
        Run r=new Run();
        r.study();
        Animal.Ass();
        Write w=new Write();
        w.study();
    }
}