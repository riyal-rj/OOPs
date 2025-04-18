package JVM.Architecture;
import java.lang.reflect.*;
public class Student {
    int roll;
    final String name="Ritankar";
    Student( int roll)
    {
        this.roll=roll;
    }
    Student()
    {
        roll=11;
    }
    public static void getStudentName()
    {
        System.out.println("getStudentName() method");
    }

    long getRoll()
    {
        System.out.println("getRoll() method");
        return 1L;
    }
}
