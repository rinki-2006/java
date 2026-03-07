import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of an array = ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]);
        }

    }
}
