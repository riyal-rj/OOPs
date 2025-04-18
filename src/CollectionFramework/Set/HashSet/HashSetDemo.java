package CollectionFramework.Set.HashSet;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet h=new HashSet();
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
