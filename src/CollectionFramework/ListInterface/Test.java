package CollectionFramework.ListInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();

        System.out.println(ll instanceof Cloneable);
        System.out.println(ll instanceof Serializable);
        System.out.println(ll instanceof RandomAccess);

        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof RandomAccess);
    }
}
