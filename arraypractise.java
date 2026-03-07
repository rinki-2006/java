import java.util.Scanner;
public class arraypractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements =  ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }

}
