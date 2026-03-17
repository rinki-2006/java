import java.io.RandomAccessFile;

public class Randomaccess {
    public static void main(String[] args) throws Exception{
    RandomAccessFile r = new RandomAccessFile("C:/Users/HP/Data1.txt", "rw");
    // code is written in file
//    byte b[] = {'R', 'I', 'N', 'K', 'I', 'M', 'I', 'T', 'T', 'A', 'L'};
    // read 3 byte
        System.out.println((char)r.read());
        System.out.println((char)r.read());
        System.out.println((char)r.read());
        // now file pointer pointing to 4th byte
        r.write('m'); // in place of k m is printing in the file

        // now file pointer is pointer to 5th byte
        System.out.println((char)r.read());

        r.skipBytes(3);  // it skip 6, 7, 8 byte
        // now file pointer is pointer to 9th byte
        System.out.println((char)r.read());

        //it will go on index 4
        r.seek(4);
        System.out.println((char)r.read());

        // find position of current pointer
        System.out.println(r.getFilePointer());

        r.seek(r.getFilePointer()-2);
        System.out.println((char)r.read());
    }
}
