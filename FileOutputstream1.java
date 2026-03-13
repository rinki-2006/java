// for creating a file and how to write data in a file
import java.io.*;

public class FileOutputstream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/HP/Desktop/java/Test.txt");
            String str = "Learning java Programming";

            // write one byte at a time in file
//            byte b[] = str.getBytes();
//            for(byte x : b){
//               fos.write(x);
//            }

            // according to offset
            byte b[] = str.getBytes();
            fos.write(b , 9, str.length()-9);

            // write all the bytes
//            fos.write(str.getBytes());  // this wil convert str into array of bytes

            fos.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){  // // handle all exception
            System.out.println(e);
        }
    }
}
