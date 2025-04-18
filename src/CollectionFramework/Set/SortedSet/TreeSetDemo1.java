package CollectionFramework.Set.SortedSet;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(new StringBuffer("a"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("M"));
        System.out.println(t);
        //StringBuffer implemented Comparable from java-11
    }
}
