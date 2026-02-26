package oops.Abstarction.Interface.interface100not;
 interface Mom {
    default void cook(){
        System.out.println("indian");
    }
}
interface Dad {
    default void cook(){
        System.out.println("chines");
    }
}
class Childern implements Mom,Dad{
    @Override
    public void cook(){
        Mom.super.cook();
        Dad.super.cook();
    }
}
class Divide{
    static void main() {
        Childern c=new Childern();
        c.cook();
    }

}