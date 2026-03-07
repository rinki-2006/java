import java.util.Scanner;
public class rightrotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements of an array = ");
//take input
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //right rotate condition
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        // print the array
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

            }
        }


