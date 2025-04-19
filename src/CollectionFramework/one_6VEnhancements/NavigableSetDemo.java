package CollectionFramework.one_6VEnhancements;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet ns=new TreeSet();
        ns.add(7.3);
        ns.add(7.5);
        ns.add(8.2);
        ns.add(8.4);
        ns.add(8.9);
        ns.add(9.3);
        ns.add(9.8);
        ns.add(10.0);
        ns.add(11.2);
        ns.add(11.5);
        ns.add(12.6);
        ns.add(12.9);
        ns.add(14.6);
        System.out.println(ns);

        System.out.println(ns.floor(10.0));//<=10.0
        System.out.println(ns.lower(10.0));//<10

        System.out.println(ns.ceiling(10.0));//>=10.0
        System.out.println(ns.higher(10.0));//>10.0

        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());

        System.out.println(ns.descendingSet());

    }
}
