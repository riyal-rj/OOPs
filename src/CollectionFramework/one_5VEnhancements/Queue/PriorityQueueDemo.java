package CollectionFramework.one_5VEnhancements.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq1=new PriorityQueue();
        pq1.offer("A");
        pq1.offer("Z");
        pq1.offer("L");
        pq1.offer("B");

        System.out.println(pq1);//Default sorting Order A-Z

        PriorityQueue pq2=new PriorityQueue<>(new MyComparator());
        pq2.offer("A");
        pq2.offer("Z");
        pq2.offer("L");
        pq2.offer("B");

        System.out.println(pq2);

    }
    static class MyComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2) {
            String s1=o1.toString();
            String s2=o2.toString();
            return s2.compareTo(s1);
        }
    }
}
