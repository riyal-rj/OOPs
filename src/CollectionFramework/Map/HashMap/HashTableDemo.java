package CollectionFramework.Map.HashMap;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable<>();
        ht.put(101,"AAA");
        ht.put(102,"BBB");
        System.out.println(ht);
//        ht.put(103,null);--> null insertion not allowed (both key and values)----> NullPointerException
//        System.out.println(ht);
    }
}
