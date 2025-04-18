package String;

public class StringTest {
    public static void main(String[] args) {
        String s1=new String("ritankar");
        String s0="ritankar";
        String s2=s1.toString();
        System.out.println(s1==s2);//true
        String s3=s1.toUpperCase();
        String s4=s1.toLowerCase();
        System.out.println(s4==s2);//true
        String s5=s1.toUpperCase();
        System.out.println(s3==s5);//false
        String s6=s2.toLowerCase();
        System.out.println(s4==s6);//true
        String s7=s3.toLowerCase();
        System.out.println(s6==s7);//false
        System.out.println(s1==s0);//false

        //This code checks your concepts in SCP and heap and methods how it makes changes in the memory
    }
}
