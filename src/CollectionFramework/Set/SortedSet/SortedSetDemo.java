package CollectionFramework.Set.SortedSet;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        TreeSet tset=new TreeSet();
        tset.add(100);
        tset.add(101);

        tset.add(102);

        tset.add(103);

        tset.add(109);

        tset.add(120);
        tset.add(110);
        System.out.println(tset.last());
        System.out.println(tset.first());
        System.out.println(tset.headSet(103));
        System.out.println(tset.tailSet(102));
        System.out.println(tset.subSet(102,109));
        System.out.println(tset.comparator());

    }
}
