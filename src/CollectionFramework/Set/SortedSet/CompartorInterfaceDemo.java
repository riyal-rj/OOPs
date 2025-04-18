package CollectionFramework.Set.SortedSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CompartorInterfaceDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new Mycomparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
        Iterator it=t.iterator();
        System.out.println(it);
    }
    static class Mycomparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2) {
            Integer I1=(Integer) o1;
            Integer I2=(Integer) o2;
//        return I1.compareTo(I2); ----> [[0, 5, 10, 15, 20]
//        return -I1.compareTo(I2); ------>[20, 15, 10, 5, 0]
//        return I2.compareTo(I1);------>[20, 15, 10, 5, 0]
//        return -I2.compareTo(I1);----->[0, 5, 10, 15, 20]
//        return +1;------> Same as Insertion Order i.e.----->[10, 0, 15, 5, 20, 20]
//        return -1;------> Reversed Insertion Order i.e. ---> [20, 20, 5, 15, 0, 10]
            return 0;//treats first element as the only element and remaining everyone as duplicates
        }

    }
}
