import java.util.*;  // for date
class student_my{
    private String rollno;

    private static int count = 1;
    private String generateroll(){
        Date d = new Date();
        String rn = "Univ - " +(d.getYear() + 1900)+ "-" + count;
        count ++;
        return rn;
    }
    public student_my(){
        rollno = generateroll();
    }
    String getroll(){
        return rollno;
    }
}
public class staticpractise {
    public static void main(String[] args) {
        student_my s1 = new student_my();
        student_my s2 = new student_my();
        student_my s3 = new student_my();
        System.out.println(s1.getroll());
        System.out.println(s2.getroll());
        System.out.println(s3.getroll());
    }
}
