package CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        //Foreward Example
        ArrayList al=new ArrayList();
        al.add("Chiru");
        al.add("Venky");
        al.add("Rama");
        al.add("Subbu");
        al.add("Mannu");
        al.add("Shyam");
        al.add("Durga");
        al.add("Narayan");
        al.add("Murli");
        al.add("Nagor");
        System.out.println(al);
        ListIterator litr=al.listIterator();
        while(litr.hasNext())
        {
            String str=(String) litr.next();
            if(str.equals("Chiru"))
                litr.set("Suraykumar");
            else if(str.equals("Durga"))
                litr.remove();
        }
        litr.add("Durga Babu");
        System.out.println(al);








        System.out.println("\n \n \n \n");






        //BackwardExample
        List fruits=new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermellon");
        fruits.add("bannana");
        fruits.add("kiwi");
        System.out.println(fruits);
        ListIterator litrf=fruits.listIterator(fruits.size());
        while(litrf.hasPrevious())
        {
            String fruit=(String)litrf.previous();
            System.out.println(fruit);
        }
        System.out.println(fruits);
    }
}
