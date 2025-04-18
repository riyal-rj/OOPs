package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map m=new HashMap();
        System.out.println(m.put(101,"Durga"));
        System.out.println(m.put(102,"Ravi"));
        System.out.println(m.put(101,"Shiva"));
        System.out.println(m);
    }
}
