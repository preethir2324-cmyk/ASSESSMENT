public interface Demo {
    //why interface are 100%  not abstract
    void sound();//abstract method

    default void run() {
        System.out.println("Running");
    }

    static void done() {
        System.out.println("doing");
    }
}
    class Lio implements Demo{
        public void sound(){
            System.out.println("Sound");
        }
    }
    class Driver {
        static void main() {
            Lio l = new Lio();
            l.sound();
            l.run();
            Demo.done();
        }
    }


