import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filepractise2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fo = new FileInputStream("C:/Users/HP/Desktop/new.txt");
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Desktop/new2.txt");
        int x;
        while((x= fo.read())!=-1){
            f.write((char)x);
        }
        fo.close();
        f.close();
    }

}
