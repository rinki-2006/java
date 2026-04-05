import java.io.FileInputStream;
import java.util.*;
public class tokenizer2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/use txt file in java/my.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);

        String data1 = new String(b);
        StringTokenizer st = new StringTokenizer(data1);

        String s;
        ArrayList<Integer> al = new ArrayList<>();
        while(st.hasMoreElements()){
            s = st.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);

    }
}
