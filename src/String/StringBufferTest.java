package String;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
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


        StringBuffer sb1=new StringBuffer(10);
        System.out.println(sb1.capacity());

        String s="012";
        StringBuffer sb2=new StringBuffer(s);
        System.out.println(sb2.capacity());//s.length+16
    }
}
