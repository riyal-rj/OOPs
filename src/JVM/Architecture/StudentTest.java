package JVM.Architecture;

public class StudentTest {
    public static void main(String[] args)throws Exception {
        Student st1=new Student();
        Class c1=st1.getClass();
        System.out.println(c1.hashCode());
        Student st2=new Student();
        Class c2=st2.getClass();
        System.out.println(c2.hashCode());

        System.out.println(c1==c2);
    }
}
