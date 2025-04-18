package CollectionFramework.Map.SortedMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeMap m=new TreeMap(Comparator.nullsFirst(String::compareTo));
//        m.put(null,"Durga");
//        System.out.println(m);

        TreeMap m=new TreeMap();
        m.put(100,"Durga");
        m.put(200,"Hari Krishna");
        m.put(300,"Tarak");
        m.put(400,"Bala");
        //m.put("AAA","Swami"); ----> RE:-  ClassCastException
        System.out.println(m);

    }
}
