package GarbageCollection;


import java.lang.ref.Cleaner;
import java.util.HashMap;
import java.util.WeakHashMap;

public class TestDemo {
    public static void main(String[] args) {
//        Resource res=new Resource();
//        res=null;
//        System.gc();

//        System.out.println("Emd of main");

        WeakHashMap m=new WeakHashMap();
        HashMap m1=new HashMap<>();
        Resource r1=new Resource();
        m.put(r1,"Durga");
        m1.put(r1,"Hari Krishna");
        System.out.println(m);
        System.out.println(m1);
        r1=null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m);
        System.out.println(m1);
    }
}
class Resource implements AutoCloseable
{
    private static final Cleaner cleaner= Cleaner.create();

    static  class State implements Runnable
    {
        private boolean cleaned =false;

        @Override
        public void run() {
            cleaned=true;
            System.out.println("Cleaning up unused resources...");
        }
    }

    private final State state;
    private final Cleaner.Cleanable cleanable;
    Resource()
    {
        state=new State();
        cleanable=cleaner.register(this,state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
    public String toString()
    {
        return "Resource";
    }
}