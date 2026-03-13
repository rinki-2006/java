import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class copyingfile {
    public static void main(String[] args) throws Exception{
        FileInputStream f = new FileInputStream("C:/Users/HP/Desktop/source1.txt");
        FileOutputStream fo = new FileOutputStream("C:/Users/HP/Desktop/source2.txt");

        int x;
        while((x=f.read())!=-1){
            if(x>=65 && x<=90){
              fo.write(x+32);  // for lower case
            }
            else{
             fo.write(x);
            }
        }
        f.close();
        fo.close();
    }
}
