import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class copyingfile2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fr = new FileInputStream("C:/Users/HP/Desktop/source1.txt");
        FileInputStream fi = new FileInputStream("C:/Users/HP/Desktop/source2.txt");
        FileOutputStream f2 = new FileOutputStream("C:/Users/HP/Desktop/destination.txt");
        SequenceInputStream s = new SequenceInputStream(fr,fi);

        int b;
        while((b=s.read())!=-1){
            f2.write(b);
        }
        fr.close();
        fi.close();
        f2.close();
        s.close();
    }
}
