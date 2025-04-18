package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        System.out.println(al.size());
        al.add(10);
        al.add(null);
        al.add(10.5d);
        System.out.println(al);
        ArrayList al1=new ArrayList();
        al1.addAll(al);
        System.out.println(al1);
    }
}
