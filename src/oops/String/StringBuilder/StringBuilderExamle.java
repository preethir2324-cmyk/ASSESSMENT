package oops.String.StringBuilder;

public class StringBuilderExamle {
    public void stringAppend() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("old string:" + sb);
        sb.append("wold");
        System.out.println("New string:" + sb);

    }

    public void stringinsert() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("old string:" + sb);
        sb.insert(1, "EEE");
        System.out.println("New string:" + sb);

    }

public void stringreverse() {
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("old string:" + sb);
    sb.reverse();
    System.out.println("New string:" + sb);
}
}
class Driver{
static void main() {
    StringBuilderExamle obj = new StringBuilderExamle();
    obj.stringAppend();
    obj.stringinsert();
    obj.stringreverse();
}
}
