import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number = ");
        int n = sc.nextInt();
        int result;
        System.out.print(a + " " + b);

        for(int i = 0; i<n-2; i++){
            result = a+b;
            a = b;
            b = result;
            System.out.print(" " + result + " ");
        }

    }
}
