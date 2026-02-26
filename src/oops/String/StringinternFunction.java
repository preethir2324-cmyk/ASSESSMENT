package oops.String;

public class StringinternFunction {
    static void main() {
        String s1=new String("Hello");//stote in heap
        String s2="Hello";//store in heap
        String s3=s1.intern();//return the reference object pooled object
        System.out.println(s1==s3);//False
        System.out.println(s2==s3);//true
    }
}
