import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) throws Exception{
        try (FileInputStream fis = new FileInputStream("C:/Users/HP/Desktop/java/Test.txt")) {
//            byte b[] = new byte[fis.available()];
//            // read all the byte from the file, and it will store in the array
//            fis.read(b);
//            // now byte array is being converted into string
//            String str = new String(b);
//            System.out.println(str);

            //now I will read byte by byte from file
//            int x;
//            do{
//                x = fis.read();
//                if(x!=-1) {
//                    System.out.print((char) x);
//                }
//            }while(x!=-1);

            // above same using file loop
            int x;
            while((x = fis.read())!=-1){
                System.out.print((char)x);
            }
        }
    }
}
