package CollectionFramework.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args)throws Exception {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("E:\\OOPS\\OOPs\\src\\CollectionFramework\\Properties\\abc.properties");
        p.load(fis);
        System.out.println(p);

        String s=p.getProperty("name");
        System.out.println(s);
        p.setProperty("new-name","Swami Narayan");
        FileOutputStream fos=new FileOutputStream("E:\\OOPS\\OOPs\\src\\CollectionFramework\\Properties\\abc.properties");
        p.store(fos,"Updated By Ritankar Jana (Demo Java class)");
        System.out.println(p);
    }
}
