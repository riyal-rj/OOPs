package CollectionFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put("Chiru",700);
        m.put("Bala",800);
        m.put("Venki",200);
        m.put("Naga",500);
        m.put("Durga",null);//null insertion allowed for key once and for values any no of times
        System.out.println(m);
        Iterator it1=m.keySet().iterator();
        System.out.println(it1);
        System.out.println(m);
        System.out.println(m.put("Chiru",1000));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

        Iterator it=m.entrySet().iterator();
        System.out.println(it);
        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if(entry.getValue()!=null && entry.getValue().equals(800))
                entry.setValue(999);
        }
        System.out.println(m);
    }
}
