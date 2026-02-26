package oops.pillers.Inheritance;

public class Preson {
    String fname;
    String lname;
    int usn;
    Preson(String fname,String Lname){
        this.fname=fname;
        this.lname=lname;
    }
}
class Student extends Preson {
    int usn;
    Student(String fname,String lname,int usn){
        super(fname,lname);//callling parent constructer insted of this key word we use this
        this.usn=usn;
    }
}
class Driver{
    static void main() {
        Student  s= new Student("PREETHI","R",82);

    }
}