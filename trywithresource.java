import java.io.*;
import java.util.*;
public class trywithresource {

    static Scanner sc;
    static void meth1() throws Exception{
        try (FileInputStream fi = new FileInputStream("C:\\Users\\HP\\Desktop\\my.txt");
             Scanner sc = new Scanner(fi))
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / c);
        }


    }
    public static void main(String[] args) {
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println(e);
        }
//        int x = sc.nextInt();
//        System.out.println(x);
    }
}
