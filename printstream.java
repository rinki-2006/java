import java.io.*;

class Student{
    int rollno;
    String name;
    String dept;

}
public class printstream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fo = new FileOutputStream("C:/Users/HP/Data2.txt");
        PrintStream p = new PrintStream(fo); // stored only string

        Student s = new Student();
        s.rollno= 10;
        s.name = "Riya";
        s.dept = "CSE";

        p.println(s.rollno);
        p.println(s.name);
        p.println(s.dept);

        fo.close();
        p.close();

        FileInputStream f = new FileInputStream("C:/Users/HP/Data2.txt");// it can not string so I require buffered reader
        BufferedReader b = new BufferedReader(new InputStreamReader(f));

        Student s1 = new Student();
        s1.rollno = Integer.parseInt(b.readLine());  // convert string to int
        s1.name = b.readLine();
        s1.dept = b.readLine();

        System.out.println(s1.rollno + " " + s1.name + " " + s1.dept);

        f.close();
        b.close();


    }
}
