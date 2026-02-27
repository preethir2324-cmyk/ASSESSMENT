package oops.String.StringBuffer;

import oops.String.StringBuilder.StringBuilderExamle;

public class StringBufferExample {
    public void stringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string:" + sb);
        sb.append("wold");
        System.out.println("New string:" + sb);

    }

    public void stringinsert() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("old string:" + sb);
        sb.insert(1, "EEE");
        System.out.println("New string:" + sb);

    }

    public void stringreverse() {
        StringBuffer sb = new StringBuffer("Hello");
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

