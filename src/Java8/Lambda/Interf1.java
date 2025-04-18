package Java8.Lambda;

@FunctionalInterface
public interface Interf1 {
    public void m1();
//    public void m2();---> Only 1 abstract method possible
    default void m5()
    {
        System.out.println("m5() default method in Functional Interface Interf1");
    }
}
@FunctionalInterface
interface Interf2 extends Interf1
{
    public void m1();
//    public void m3();
}
class Test implements Interf2
{
    @Override
    public void m1() {
        System.out.println("m1() method of Functional Interface Interf1 implemented in class Test");
    }

//    @Override
//    public void m2() {
//        System.out.println("m2");
//    }
//
//    @Override
//    public void m3() {
//        System.out.println("m3");
//    }

    public static void main(String[] args) {
        Interf2 in2=new Test();
        in2.m1();
        in2.m5();
    }
}
