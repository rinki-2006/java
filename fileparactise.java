// create the file and write the content and read the content
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileparactise {
    public static void main(String[] args) throws Exception{
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Desktop/new.txt");
        String str = "Hello world";
        byte b[] = str.getBytes();
        f.write(b);

        FileInputStream fi = new FileInputStream("C:/Users/HP/Desktop/new.txt");
        int a;
        while((a = fi.read())!=-1){
            System.out.print((char)a);
        }
        f.close();
        fi.close();
    }


}
