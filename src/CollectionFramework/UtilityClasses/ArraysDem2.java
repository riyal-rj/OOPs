package CollectionFramework.UtilityClasses;

import java.util.Arrays;
import java.util.List;

public class ArraysDem2 {
    public static void main(String[] args) {
        int []arr={0,-5,-67,89,38,2,234,-345};
        System.out.println(Arrays.toString(arr));

        List l=Arrays.asList(arr);//not applicable for primitive array
        System.out.println(l);

        String[] strArr = {"Java", "Python", "C++", "Go", "Rust"};
        List list = Arrays.asList(strArr);
        System.out.println(list);

        strArr[0]="Javascript";
        System.out.println(list);
        System.out.println(list.get(3));

        //list.add("C");//----> RE:- UnsupportedOperationException
        System.out.println(list);
        list.remove("C");// No error no adding so no removal
        //list.remove("Go");//----> RE:- UnsupportedOperationException
        list.set(3,"Golang");
        System.out.println(list);
    }
}
