class student{
    String name;  //data member or object property
    int age;
    int rollno;
    double marks;
    String gmail;

    void display(){  // member function or object behaviour
        System.out.println(
                "Name = "+name+"\n"+"Age = "+age+"\n"+"Roll no. = "+rollno+"\n"+"Marks = "+marks+"\n"+"Gmail = "+gmail+"\n"
        );
    }
}

public class classcreation2 {
    public static void main(String[] args) {
        student s1 = new student();  //creation of object
        student s2 = new student();

        s1.name = "Rinki";
        s1.age = 19;
        s1.marks = 67.89;
        s1.rollno = 78;
        s1.gmail = "rinkimittal2006@gmail.com";

        s2.name = "Riya";
        s2.age = 20;
        s2.marks = 68.89;
        s2.rollno = 79;
        s2.gmail = "riyamittal2006@gmail.com";

        s1.display();  // function call
        s2.display();
    }
}

