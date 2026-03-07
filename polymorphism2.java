// overriding or run time polymorphism
class Super2{
    void display(){
        System.out.println("display function of super class");
    }
}
class sub5 extends Super2{
    void display(){
        System.out.println("display function of sub class ");
    }
}
public class polymorphism2 {
    public static void main(String[] args) {
        Super2 t = new Super2();
        t.display();
    Super2 s = new sub5();
    s.display();
    }
}
