import java.io.*;

class student_a{
    int rollno;
    String name;
    String dept;
    float avg;
}
public class datastream {
    public static void main(String[] args) throws Exception{
//        FileOutputStream f = new FileOutputStream("C:/Users/HP/Data3.txt");
//        DataOutputStream d = new DataOutputStream(f);
//
//        student_a s = new student_a();
//        s.rollno = 10;
//        s.name = "Rinki";
//        s.dept = "CSE";
//        s.avg = 67.90f;
//
//        d.writeInt(s.rollno);
//        d.writeUTF(s.name);  //for writing string
//        d.writeUTF(s.dept);
//        d.writeFloat(s.avg);
//
//        f.close();
//        d.close();

        FileInputStream fi = new FileInputStream("C:/Users/HP/Data3.txt");
        DataInputStream di = new DataInputStream(fi);

        student_a s = new student_a();
        s.rollno = di.readInt();
        s.name = di.readUTF();
        s.dept = di.readUTF();
        s.avg = di.readFloat();

        System.out.println(s.rollno +  " " + s.name + " " + s.dept + " " + s.avg);
        fi.close();
        di.close();

    }
}
