package CollectionFramework.one_6VEnhancements;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap nm=new TreeMap();
        nm.put(23, "Charlie");
        nm.put(87, "Delta");
        nm.put(19, "Alpha");
        nm.put(66, "Golf");
        nm.put(48, "India");
        nm.put(9, "Echo");
        nm.put(72, "Bravo");
        System.out.println(nm);

        System.out.println("\n Methods related to keys:- \n");
        System.out.println(nm.ceilingKey(19));
        System.out.println(nm.ceilingKey(25));
        System.out.println(nm.higherKey(19));

        System.out.println(nm.floorKey(19));
        System.out.println(nm.floorKey(25));
        System.out.println(nm.lowerKey(19));

        System.out.println("\n Methods related to entries:- \n");
        System.out.println(nm.ceilingEntry(19));
        System.out.println(nm.lowerEntry(19));
        System.out.println(nm.higherEntry(19));
        System.out.println(nm.floorEntry(19));

        System.out.println("\n Methods related to polls:- \n");
        System.out.println(nm.pollFirstEntry());
        System.out.println(nm.pollLastEntry());


        System.out.println(nm);
        System.out.println("\n Methods related to descending:- \n");
        System.out.println(nm.descendingMap());
        System.out.println(nm.descendingKeySet());

    }

}
