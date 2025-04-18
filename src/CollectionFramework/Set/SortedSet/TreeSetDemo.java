package CollectionFramework.Set.SortedSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
//        t.add("A");
//        t.add("J");
//        t.add("M");
//        t.add("D");
//        t.add("Z");
//        t.add("a");
        t.add(null);
        System.out.println(t);
//        t.add(10); RE: ClassCastException
//        t.add(null);RE: NullPointerException why???
    }
}
