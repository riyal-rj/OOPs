package CollectionFramework.Map.SortedMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m=new TreeMap(Comparator.nullsFirst(String::compareTo));
        m.put(null,"Durga");
        System.out.println(m);

    }
}
