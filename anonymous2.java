abstract class demo3{
    abstract void display();
}
class demo4{
    void meth1(){
        demo3 d = new demo3(){
          void display(){
              System.out.println("hello");
          }
        };
       d.display();
    }
}
public class anonymous2 {
    public static void main(String[] args) {
        demo4 d2 = new demo4();
        d2.meth1();
    }
}
