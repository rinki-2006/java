import java.util.Scanner;
public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter difference = ");
        int d = sc.nextInt();
        System.out.println("Enter last number = ");
        int n = sc.nextInt();
        int temp = a;

        for(int i = 0;i<=n; i++){
            System.out.print(temp + " ");
            temp = temp +d;
        }

    }

}
