package oops.GarbageCollection.Delete;

public class Demo {
    public void finalize(){
        System.out.println("Grabage collection");

    }

    static void main() {
        for(int i=0;i<10000;i++) {//10000 obj creacted
            Demo obj = new Demo();//one
            obj = null;
        }
        System.gc();//not neccessary to call the gc all the time
    }
}
