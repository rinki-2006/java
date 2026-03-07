import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();

        System.out.println("Enter b = ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0, try again");

        }

        System.out.println("Bye");


    }
}
