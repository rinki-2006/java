interface Test1{
    void meth1();
    void meth2();
}
class MY implements Test1{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
}
public class interface1 {
    public static void main(String[] args) {
        Test1 t = new MY();
        t.meth1();
        t.meth2();
    }
}
