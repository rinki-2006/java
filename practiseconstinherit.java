class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}
class Student4 extends Person{
    int rollno;

    Student4(String n, int r){
        super(n);
        rollno = r;
    }
    void display(){
        System.out.println(this.name + "\n" + rollno);
    }
}
public class practiseconstinherit {
    public static void main(String[] args) {
       Student4 s = new Student4("Rinki", 12) ;
       s.display();
    }
}
