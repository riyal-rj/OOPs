package CollectionFramework.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap m=new TreeMap();
        m.put(101,"A");
        m.put(102,"B");
        m.put(105,"R");
        m.put(106,"J");
        m.put(121,"XX");
        m.put(136,"MN");
        System.out.println(m.firstKey());
        System.out.println(m.lastKey());
        System.out.println(m.headMap(106));
        System.out.println(m.tailMap(105));
        System.out.println(m.subMap(102,121));
    }
}
