package oops;

public class Copycons {
    String name;
    int usn;
    //constructer
    Copycons(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    //copy constructer
    Copycons(Copycons copy){
        this.name=copy.name;
        this.usn=copy.usn;
    }
    void dispaly(){
        System.out.println(name+" "+usn);
    }
}
class ex{
static void main() {
    Copycons C = new Copycons ("Preethi", 23);
    Copycons C1 = new Copycons (C);//the content are copied from c  as it is
    C.dispaly();
    C1.dispaly();

}
}
