package oops.pillers;

public class StudentEncap {
    private  String name;
    private int usn;
    StudentEncap(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }
    int getusn(){
        return this.usn;
    }
    void setusn() {
        this.usn = usn;
    }
    void print(){
        System.out.println("Name"+name+"\n usn:"+usn);
    }
}
class encap{
    static void main() {
        StudentEncap s= new StudentEncap("preethi",34);
        s.print();
        s.setName("Rakshitha");
        s.print();
        System.out.println("name:"+s.getName());

    }
}
