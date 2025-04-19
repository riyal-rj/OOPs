package CollectionFramework.UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("A");
        al.add("M");
        al.add("K");
        al.add("C");
        al.add("Z");
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Collections.sort(al,new MyComparator());
        System.out.println(al);
    }
    static class MyComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2) {
            String s1=o1.toString();
            String s2=o2.toString();
            return  s2.compareTo(s1);
        }
    }
}
