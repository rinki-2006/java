import java.io.*;     // for opening a file
import java.util.*;   // use Scanner for reading from the file

public class trywithfinally {

    static Scanner sc;
    static FileInputStream fi;  // for reading from the file we create a reference
     static void Divide() throws Exception{
         try {
             fi = new FileInputStream("C:\\Users\\HP\\Desktop\\my.txt");
             sc = new Scanner(fi);
             int a = sc.nextInt();
             int b = sc.nextInt();
             int c = sc.nextInt();
             System.out.println(a / c);
         }
        finally {

             fi.close();
             sc.close();
         }
     }
    public static void main(String[] args) {
         try {
             Divide();
         }
         catch (Exception e){
             System.out.println("division by zero exception");
         }
        int x = sc.nextInt();  //if it sc is closed then we would not able
//         to access in main function
        System.out.println(x);
    }
}
