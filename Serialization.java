import java.io.*;

class student_our implements Serializable{
    int rollno;
    String name;
    String dept;
    float avg;
    static int data = 10;


    student_our(){}

    student_our(int r, String n, String d, float f){
        rollno = r;
        name = n;
        dept = d;
        avg = f;
        data = 500;
    }
    public String toString(){
        return "\n Student Details\n"+
                "\n Rollno. "+rollno+
                "\nDept "+ dept +
                "\nAverage " + avg +
                "\nData "+ dept + "\n";
    }
}

public class Serialization {
    public static void main(String[] args) throws Exception{
        FileOutputStream f = new FileOutputStream("C:/Users/HP/Data4.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);

        student_our s = new student_our(10, "rinki", "cse" , 57.98f);
        o.writeObject(s);

        f.close();
        o.close();

        FileInputStream fi = new FileInputStream("C:/Users/HP/Data4.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        student_our s1 = (student_our)oi.readObject();
        System.out.println(s1);

        fi.close();
        oi.close();



    }
}
