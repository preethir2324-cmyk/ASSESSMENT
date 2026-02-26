package oops;

public class Student {
    String Name;
    int Usn;
    String Dep;

    public Student(String Name, int Usno, String Dept) {
        this.Name = Name;
        Dep = Dept;
        Usn=Usno;
    }

    void printRecord() {
        System.out.println("Name:" + this.Name);
        System.out.println("Department:"+ Dep);
        System.out.println("USN:" +Usn);
    }
}

 class Detailes{
     static void main()
     {
         Student s1=new Student("Preethi",82,"cse");
         Student s2=new Student("Shrusti",102,"cse");
         Student s3=new Student("Rakshitha",88,"cse");
         Student s4=new Student("Ashika",116,"cse");
         s1.printRecord();
         s2.printRecord();
         s3.printRecord();
         s4.printRecord();
     }
 }