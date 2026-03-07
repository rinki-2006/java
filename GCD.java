import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter second number = ");
        int b = sc.nextInt();

        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
            System.out.println("gcd = " +a);
        }
    }
}
