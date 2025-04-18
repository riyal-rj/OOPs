package Java8.Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        I1 i=p-> System.out.println(p);

        //ex-1
        //I1 i1=(int x,int y)-> System.out.println(x+y);    //CE:- java: incompatible types: incompatible parameter types in lambda expression

        //ex-2
        /* I1 i1=(int p)-> {
            return p;
        };                //CE:- java: incompatible types: bad return type in lambda expression unexpected return value          */


        System.out.println(i);
        i.m1('a'+'b'+'c'+'d'+'e');

    }
    interface I1
    {
        void m1(int x);
    }

}

