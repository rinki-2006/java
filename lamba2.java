@FunctionalInterface
interface lambdademo{
    public void display();
}
class Uselambda{
    public void callLambda(lambdademo l){
        l.display();
    }
}
class our_2{
    public void meth1(){
        Uselambda u = new Uselambda();
        u.callLambda(()->{
            System.out.println("Hello");  // we pass lambda expression to lambdademo l
        });
    }
}
public class lamba2 {
    public static void main(String[] args) {
        our_2 o = new our_2();
        o.meth1();
    }
}
