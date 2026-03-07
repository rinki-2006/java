// abstract class
abstract class Super_1{
    Super_1(){
        System.out.println("Constructor of super class");
    }
    void Meth1(){
        System.out.println("Method 1 of super class");
    }
    abstract void Meth2();
}
// concrete class
class sub_1 extends Super_1{
    sub_1(){
        System.out.println("constructor of sub class");
    }
    void Meth2(){
        System.out.println("Meth2 of sub class");
    }
}
public class abstract1 {
    public static void main(String[] args) {
    Super_1 s = new sub_1();
    s.Meth2();
    s.Meth1();

    sub_1 s2 = new sub_1();
    s2.Meth1();
    s2.Meth2();

    }
}
