import java.io.*;
public class seraialization2 {
    public static void main(String[] args) throws Exception{
        float f2[] = {10.3f,2.9f, 6.4f, 3.7f};
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Data5.txt");
        DataOutputStream d = new DataOutputStream(f);
        // first read how many elements are there
        d.writeInt(f2.length);

        for(float f3: f2){
            d.writeFloat(f3);
        }
        d.close();
        f.close();

        FileInputStream fis = new FileInputStream("C:/Users/HP/Data5.txt");
        DataInputStream dis = new DataInputStream(fis);
        // read the number of elements
        int length = dis.readInt();
        float data;
        for(int i = 0; i<length;i++){
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
