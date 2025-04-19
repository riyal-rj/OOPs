package CollectionFramework.UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(-8);
        al.add(76);
        al.add(100);
        al.add(0);
        al.add(1);
        al.add(625);

        System.out.println(al);
        Collections.sort(al);//ascending
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,625));
        System.out.println(Collections.binarySearch(al,625,new MyComparator()));
        Collections.sort(al,new MyComparator());//descending
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,625,new MyComparator()));
        Collections.reverse(al);//ascending
        System.out.println(al);

    }
    static class MyComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2) {
            Integer s1=(Integer) o1;
            Integer s2=(Integer) o2;
            return  s2.compareTo(s1);
        }
    }
}
