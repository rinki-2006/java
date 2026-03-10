interface demo{
 public info message(String s);  // constructor have no return type so return type of message function is constructor itself
}
class info{
    public info(String s){
        System.out.println("hello " + s);
    }
}
public class methodreferencelambda2 {
    public static void main(String[] args) {
        demo d = info::new;
        d.message("Rinki");
    }
}
