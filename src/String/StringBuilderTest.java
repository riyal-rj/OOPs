package String;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());//default size is 16

        sb.append(12345678);
        sb.append(12345678);
        sb.append(9);
        System.out.println(sb.capacity());//(16+1)*2=34

        sb.append(12345678);
        sb.append(12345678);
        sb.append(9);
        sb.append(12345678);
        sb.append(12345678);
        sb.append(9);
        System.out.println(sb.capacity());//70

        String s="01234567";
        StringBuilder sb1=new StringBuilder(s);
        System.out.println(sb1.capacity());

    }
}
