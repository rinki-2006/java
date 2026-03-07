import java.io.*;
import java.lang.Exception;
// checked exception give error at the time of compilation ,
// so it must write try and catch block
public class checkedexception {
    static void fun1() {
        try {
            FileInputStream f = new FileInputStream("My.txt");
        }
        catch (Exception e){
            System.out.println("file not found");
        }
    }

    public static void main(String[] args) {
        fun1();
    }
}
