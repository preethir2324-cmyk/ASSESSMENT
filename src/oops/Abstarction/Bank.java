package oops.Abstarction;

abstract class Bank {
    String branch;
    Bank(String branch){
        this.branch=branch;
        System.out.println("bRANCH is"+branch);

    }
    abstract void calculateIntrest();
}
class HDFC extends Bank{
    HDFC(String branch){
        super(branch);
    }
    void calculateIntrest(){
        System.out.println("interst is 10%");

    }
}
class Driver{
    static void main() {
        HDFC obj=new HDFC("NAGSANDRA");
        obj.calculateIntrest();

    }
}