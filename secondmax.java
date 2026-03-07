import java.util.Scanner;
public class secondmax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[5];
        System.out.println("Enter elements = ");
        int max = arr[0];
        int max1 = arr[0];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max1 = max;
                max = arr[i];
            }
            else if(arr[i]>max1){
                max1 = arr[i];
            }
        }
        System.out.println("max = " + max1);

        }
    }

