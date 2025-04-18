package CollectionFramework.Set.SortedSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ComparatorDemoString {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("Raja");
        t.add("Sobha Rani");
        t.add("Rajakumari");
        t.add("Ganga Bhavani");
        t.add("Ramalamma");
        System.out.println(t);

    }
    static class MyComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            String s1=(String)o1;
            String s2=(String) o2;
            return s2.compareTo(s1);
        }
    }

}

