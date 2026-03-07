interface my2{
    void meth1();
}
class outer2{
    void display(){
        // anonymous class
        my2 m = new my2() {
            public void meth1() {
                System.out.println("hello");
            }
        };
    m.meth1();
    }
}
public class anonymousinnnerclass {
    public static void main(String[] args) {
        outer2 o = new outer2();
        o.display();
    }
}
