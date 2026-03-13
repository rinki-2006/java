import java.io.*;
public class filereader {
    public static void main(String[] args) throws Exception {
        try(FileReader fr = new FileReader("C:/Users/HP/Desktop/java/Test.txt")){

            int x;
            while((x = fr.read())!=-1){
                System.out.print((char)x);  // we convert into char because we take x as int
            }
        }
    }
}
