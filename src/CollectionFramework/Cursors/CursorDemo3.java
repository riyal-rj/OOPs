package CollectionFramework.Cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorDemo3 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
//        Enumeration en=ll.elements();
//        System.out.println(en.getClass().getName());


        Iterator itr=ll.iterator();
        System.out.println(itr.getClass().getName());

        ListIterator litr=ll.listIterator();
        System.out.println(litr.getClass().getName());
    }
}
