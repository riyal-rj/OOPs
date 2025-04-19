package CollectionFramework.Map.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put(new Test(5),"A");
        h.put(new Test(2),"B");
        h.put(new Test(6),"C");
        h.put(new Test(15),"D");
        h.put(new Test(23),"E");
        h.put(new Test(16),"F");
        System.out.println(h);
    }
    static class Test
    {
        int i;
        Test(int i)
        {
            this.i=i;
        }
        public int hashCode()
        {
            return i;
        }
        public String toString()
        {
            return i+"";
        }
    }
}
