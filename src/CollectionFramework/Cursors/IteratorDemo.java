package CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        for(int i=0;i<=10;i++)
            al.add(i);
        System.out.println("Original"+al);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer) itr.next();
            if(i%2==0)
                System.out.println(i);
            else
                itr.remove();
        }
        System.out.println("After: "+al);
    }
}
