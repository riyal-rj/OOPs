package CollectionFramework.Map.HashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args)throws InterruptedException {
        HashMap m=new HashMap();
        Temp t1=new Temp();
        m.put(t1,"Durga");
        System.out.println(m);
        t1=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

        WeakHashMap wh=new WeakHashMap();
        Temp t2=new Temp();
        wh.put(t2,"Pawan");
        System.out.println(wh);
        t2=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(wh);

    }
    static class Temp
    {
        public String toString() {
            return "Temp";
        }
    }
}
