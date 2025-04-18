package CollectionFramework.Set.HashSet.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h=new LinkedHashSet();
        h.add(1);
        h.add(2);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.add(10));
        System.out.println(h.add(10));
        h.add(null);
        h.add("akndkdk");
        System.out.println(h);
        System.out.println(h.iterator());
    }
}
