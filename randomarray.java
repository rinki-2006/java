import java.util.Scanner;
public class randomarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        System.out.println("Enter elements = ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10);  // int function is used for typecasting
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
