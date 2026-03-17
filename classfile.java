import java.io.File;
import java.io.FileOutputStream;

public class classfile {
    public static void main(String[] args) {
        File f = new File("C:/Users/HP/Desktop/java");
        System.out.println(f.isDirectory());
//        String list[] = f.list();
//        for(String x : list){
//            System.out.print(x.getName() + " ");
//            System.out.println(x.getPath());
//        }

        File list[] = f.listFiles();
        for(File x : list){
            System.out.print(x.getName() + " ");
            System.out.println(x.getPath());
        }


    }
}
