interface mylambda2{
    public int add(int x, int y);
}
public class lambdaparameter {
    public static void main(String[] args) {
        mylambda2 m =
                (a, b)->{
            return a + b;
                };
        System.out.println(m.add(5,10));
    }
}
