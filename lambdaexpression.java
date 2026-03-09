@FunctionalInterface  // having one method
interface Mylambda{
    public void display();
}
public class lambdaexpression {
    public static void main(String[] args) {
        // anonymous method
        Mylambda m =
                () ->  // referring to display method
                {
                    System.out.println("Hello"); // body of method
                };
        m.display();
    }
}

