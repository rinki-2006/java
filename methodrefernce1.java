@FunctionalInterface
interface my_lambda1{
    public int calc(int a, int b);  // return type of below given function is int so calc method has return type of int
}
class opeartion{
    public static int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
}
public class methodrefernce1 {
    public static void main(String[] args) {
      //  static reference
        my_lambda1 m = opeartion::add;
        System.out.println(m.calc(10,20));

        // non-static reference
        opeartion o = new opeartion();
        my_lambda1 ml = o::sub;
        System.out.println(ml.calc(20,10));
    }
}
