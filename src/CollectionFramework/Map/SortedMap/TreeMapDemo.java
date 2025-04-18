package CollectionFramework.Map.SortedMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeMap m=new TreeMap(Comparator.nullsFirst(String::compareTo));
//        m.put(null,"Durga");
//        System.out.println(m);

        //TreeMap m=new TreeMap();---> DNSO (Default Natural Sorting Order)
        // Output:--->  {100=Durga, 200=Hari Krishna, 300=Tarak, 400=Bala}
        TreeMap m=new TreeMap(new MyComparator());// ---> customized Sorting
        //Output :- {400=Bala, 300=Tarak, 200=Hari Krishna, 100=Durga}
        m.put(100,"Durga");
        m.put(200,"Hari Krishna");
        m.put(300,"Tarak");
        m.put(400,"Bala");
        //m.put("AAA","Swami"); ----> RE:-  ClassCastException
        System.out.println(m);

    }
    static class MyComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2) {
            String s1=o1.toString();
            String s2=o2.toString();
            return s2.compareTo(s1);
        }
    }
}
