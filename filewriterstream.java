import java.io.FileWriter;

public class filewriterstream {
    public static void main(String[] args) throws Exception{
        try(FileWriter fw = new FileWriter("C:/Users/HP/Desktop/java/Test.txt1")){
            String str = "Java";
            fw.write(str);
        }

    }
}
