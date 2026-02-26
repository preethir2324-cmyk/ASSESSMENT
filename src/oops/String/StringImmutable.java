package oops.String;

public class StringImmutable {
    static void main() {
        String str="Hello ";
        str.concat("wold");
        System.out.println(str);
        //correctly work with string
        str=str.concat("wold");
        System.out.println(str);
    }
}
