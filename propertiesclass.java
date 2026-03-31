import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class propertiesclass {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
//        p.setProperty("Brand" , "Dell");
//        p.setProperty("Processor", "i7");
//        p.setProperty("OS" , "Window10");
//        p.setProperty("Model", "Latitude");

//        System.out.println(p);
//        p.store(new FileOutputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Data1.txt"), "Laptop");

        // for reading
//        p.storeToXML(new FileOutputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Data1.xml"), "Laptop");
//
//        p.loadFromXML(new FileInputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Data1.xml"));
//        System.out.println(p);  get all property

        // read from txt file
        p.load(new FileInputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Data1.txt"));
        System.out.println(p.getProperty("Name"));
    }
}
