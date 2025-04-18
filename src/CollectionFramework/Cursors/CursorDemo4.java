package CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorDemo4 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
//        Enumeration en=al.elements();
//        System.out.println(en.getClass().getName());


        Iterator itr=al.iterator();
        System.out.println(itr.getClass().getName());

        ListIterator litr=al.listIterator();
        System.out.println(litr.getClass().getName());
    }
}
