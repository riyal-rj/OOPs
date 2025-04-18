package CollectionFramework.ListInterface.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.println(ll.size());
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(99);
        System.out.println(ll);
    }
}
