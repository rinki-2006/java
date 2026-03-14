import java.io.FileOutputStream;
import java.util.Scanner;

public class userinputfile {
    public static void main(String[] args) throws Exception{
        // for taking input from the user
        Scanner sc = new Scanner(System.in);

        // create a file
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Desktop/new3.txt");

        System.out.println("Enter text");
        String str = sc.nextLine();
        // convert string into bytes
        byte b[] = str.getBytes();
        f.write(b);

        f.close();
        System.out.println("Data written in a file");
    }
}
