package CollectionFramework.Cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class CursorDemo2 {
    public static void main(String[] args) {
        Stack st=new Stack();
        Enumeration en=st.elements();
        System.out.println(en.getClass().getName());

        Iterator itr=st.iterator();
        System.out.println(itr.getClass().getName());

        ListIterator litr=st.listIterator();
        System.out.println(litr.getClass().getName());
    }
}
