// using try with resources and all are same like file 1
import java.io.FileOutputStream;

public class fileoutputstream2 {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/Test.txt")) {
            String str = "Learn java programming";
            byte b[] = str.getBytes();
            fos.write(b);
            System.out.println(b);
        }
    }
}