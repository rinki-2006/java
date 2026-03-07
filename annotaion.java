// override
abstract class Parent{
    abstract public void display();
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Override");
    }
}
public class annotaion {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
