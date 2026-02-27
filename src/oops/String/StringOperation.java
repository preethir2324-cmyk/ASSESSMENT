package oops.String;

public class StringOperation {
    static void main() {
        //create the string
        String s1=new String("Java Programming");
        String s2="Java Programming";
        System.out.println("Orginal string: \t" +s1);//t :tab
        //length
        System.out.println("String length:"+s1.length());
        //CharAt
        System.out.println("Index of: "+s1.charAt(3));
        //toUpperCase and toLowerCase
        System.out.println("UpperCase:"+s1.toUpperCase());
        System.out.println("LowerCase:"+s1.toLowerCase());
        //equal and ==
        System.out.println("Compare the value:"+s1.equals(s2));
        System.out.println("check the location:" +(s1==s2));
        //comapareTo()
        System.out.println("It does the lexicalgraphic (Ascii) comparision:"+ s1.compareTo(s2));
        //substring()
        System.out.println("Substring:"+s1.substring(0,4));
        //contains()
        System.out.println("present :"+s1.contains("python"));
        //indexof()
        System.out.println("Index of string:"+s1.indexOf("a"));
        //replace()
        System.out.println("Replace"+s1.replace("java","python"));
        //startsWith and endWith()
        System.out.println("Start with:"+s1.startsWith("Java"));
        System.out.println("End with:"+s1.endsWith("ing"));
        //trim()
        String s3="           Preethi           ";
        System.out.println("Name:"+s3.trim(  ));
        //concat
        System.out.println("Concat():"+s1.concat("language"));
        //isEmpty()
        String str="";
        System.out.println("Is Empty: "+str.isEmpty());
        //split
        String sentance="java is programming language";
        String[] arr=sentance.split("a");
        System.out.println("After split:" );
        for(String i:arr){
            System.out.println(i);
        }

    }
}
