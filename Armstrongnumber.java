import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int num = sc.nextInt();
        int r;
        int num1=num;
        int sum = 0;

         while(num>0){
             r = num%10;
             num = num/10;
             sum = sum + r*r*r;


         }
        if(sum==num1){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong numbers");
         }
    }
}
