package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue qu=new LinkedList();
        System.out.println(qu.poll()); // -> null
        //System.out.println(qu.remove());  RE: NoSuchElementException

        System.out.println(qu.peek()); // ---> null
        //System.out.println(qu.element()); RE: NoSuchElementException


        qu.add(123);
        qu.add(121);
        qu.add(456);
        qu.add(921);
        System.out.println(qu);
    }
}
