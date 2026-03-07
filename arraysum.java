import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
        System.out.println("Enter elements = ");
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
