package String;
//custom immutable class  --> to understand strung immutability concept
final public class MyImmutable {
    private int i;
    MyImmutable(int i)
    {
        this.i=i;
    }

    public MyImmutable modify(int i)
    {
        if(this.i==i)
            return this;
        else
            return new MyImmutable(i);
    }
}

class MyImmutableTestDemo
{
    public static void main(String[] args) {
        MyImmutable i1=new MyImmutable(100);
        MyImmutable i2=i1.modify(120);
        System.out.println(i1==i2);
        MyImmutable i3=i1.modify(100);
        System.out.println(i1==i3);

        final StringBuffer sb=new StringBuffer();
        sb.append("durga");
        sb.append("Puja");
        System.out.println(sb);
    }
}
