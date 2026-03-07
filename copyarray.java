import java.util.Scanner;
public class copyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input
        System.out.println("Enter size of an array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements = ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //print first array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // for next line
        System.out.println();
        // create second array
        int arr1[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        // print new array
        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
