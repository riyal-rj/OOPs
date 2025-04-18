package CollectionFramework.Map.HashMap;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        String str1 = new String("A");
        String str2 = new String("A");
        hm.put(str1, "Durga");
        hm.put(str2, "Raja");
        System.out.println(hm);


        IdentityHashMap im = new IdentityHashMap();
        im.put(str1, "Durga");
        im.put(str2, "Raja");
        System.out.println(im);
    }
}
