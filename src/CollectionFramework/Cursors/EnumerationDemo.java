package CollectionFramework.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        for(int i=0;i<=10;i++)
            v.add(i);
        System.out.println("Original Vector: -"+v);
        Enumeration en=v.elements();
        while(en.hasMoreElements())
        {
            Integer i=(Integer) en.nextElement();
            if(i%2==0)
                System.out.println(i);
        }
        System.out.println("After: -"+v);
    }
}
