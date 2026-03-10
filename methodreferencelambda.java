@FunctionalInterface
interface lambda_my{
    public void display(String str);
}
public class methodreferencelambda {
    public methodreferencelambda(String s){
        System.out.println(s.toUpperCase());
    }
    public void reverse(String str){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
    public static void main(String[] args) {

        // in this display is acting like println
//        lambda_my m = System.out::println;
//        m.display("Hello");

        // when reverse is static
//        lambda_my ml = methodreferencelambda::reverse;
//        ml.display("Hello");

        // when reverse is not static
//        methodreferencelambda l = new methodreferencelambda();
//        lambda_my m = l::reverse;
//        m.display("Hello");

        // for constructor
        lambda_my m = methodreferencelambda::new;
        m.display("Hello");

    }
}
