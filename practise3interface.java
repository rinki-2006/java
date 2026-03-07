interface Test{
    void meth1();
    void meth2();
    private void meth3(){
        System.out.println("meth3");
    }
    default void meth5(){
        meth3();
    }
}
interface Test2 extends Test{
    void meth4();
}
class Test3 implements Test2{
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}
public class practise3interface {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.meth5();
    }
}
