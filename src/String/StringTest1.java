package String;

import java.sql.SQLOutput;

public class StringTest1 {
    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=s1.toString();
        String s3=s2.toUpperCase();
        String s4=s1.toLowerCase();
        String s5=s3.toLowerCase();
        String s7="DURGA";
        String s6=s7.toLowerCase();
        String s8=s5.toUpperCase();

        System.out.println(s3==s7);
        System.out.println(s6==s4);
        System.out.println(s6==s5);
        System.out.println(s8==s3);
    }
}
