package JVM.Architecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args)throws Exception {
        Class c=Class.forName("JVM.Architecture.Student");

        System.out.println("\n Methods in Student Class:- ");
        Method[] methods= c.getDeclaredMethods();
        for(Method method:methods)
            System.out.println(method);

        System.out.println("\n Fields in Student Class:- ");
        Field []fields=c.getDeclaredFields();
        for(Field field:fields)
            System.out.println(field);

        System.out.println("\n Constructors in Student Class:- ");
        Constructor[]constructors=c.getDeclaredConstructors();
        for(Constructor constructor:constructors)
            System.out.println(constructor);
    }
}
