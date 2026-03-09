interface mylambda3{
    public void display();
}
class our1{
    int temp = 0;  // instance variable we can access it or modify it
    public void meth1(){
        int x = 0;  // lambda expression can access the variable of method,but it is final, or not modify
        mylambda3 m =
                ()->{
            int count = 0;  // lambda expression can have own variable and you can access it or modify it
                    System.out.println("HI" + x);
                    System.out.println("Bye" + count++);
                    System.out.println("World" + temp++);
                };
        m.display();
    }
}
public class lambdavariablecapture {
    public static void main(String[] args) {

    }
}
