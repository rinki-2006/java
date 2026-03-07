class Super1{
    public void display(){
        System.out.println("Java");
    }
}
class sub2 extends Super1{
    public void display(){
        System.out.println("Hello world");
    }
    public void show(){
        System.out.println("welcome");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
      Super1 s = new sub2();
      s.display();

    }
}
