package CollectionFramework.Cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        Enumeration en=v.elements();
        System.out.println(en.getClass().getName());
        Enumeration en2=v.elements();
        System.out.println(en2.getClass().getName());

        Iterator itr=v.iterator();
        System.out.println(itr.getClass().getName());

        ListIterator litr=v.listIterator();
        System.out.println(litr.getClass().getName());

    }
}
