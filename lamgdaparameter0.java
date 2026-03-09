interface my_lambda{
    public void display(String str);
}
public class lamgdaparameter0 {
    public static void main(String[] args) {
        my_lambda m =
                (s)->{
                    System.out.println(s);
                };
        m.display("Hello world");
    }
}
