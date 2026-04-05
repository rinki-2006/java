import java.io.FileInputStream;
import java.util.*;
public class Tokenizer {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/use txt file in java/student1.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data = new String(b);
//    String data = "name = Rinki; address = delhi; country = India; dept = cse";
    StringTokenizer st = new StringTokenizer(data,"=;");
    String s;
    while(st.hasMoreElements()){
        s = st.nextToken(); // take token
        System.out.println(s);
    }
    }
}
