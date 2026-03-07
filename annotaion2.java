// for deprecated and suppress warning
import java.util.*;  // for list interface
class oldcar{
    public void display(){
        System.out.println("Hello");
    }
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}
public class annotaion2 {
    static List l;  // list is a built-in interface from util package
    @SuppressWarnings("unchecked")  // do not give me unchecked warning because I can without creating an object
//    @SuppressWarnings("deprecation")  // do not give me deprecated warning  because show is deprecated
    public static void main(String[] args) {
        l.add(10);
//        oldcar o = new oldcar();
//        o.show();
    }
}
