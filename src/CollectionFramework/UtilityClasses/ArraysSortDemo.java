package CollectionFramework.UtilityClasses;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int []arr={0,-5,-67,89,38,2,234,-345};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,1,4);
        //Arrays.sort(arr,-1,100);//RE:- ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,234));
        System.out.println(Arrays.binarySearch(arr,-420));//---> returns the -(valid index where is to be inserted +1) i.e. here -1 but if 420 is the key then -9

        //Arrays.parallelSort();  //--> used for large size array to implement multiple cores for sorting ---> multiple threading

        //Arrays.sort(arr,new Demo2.MyComparator());  //---> here the array must be always be of object type
    }
}
