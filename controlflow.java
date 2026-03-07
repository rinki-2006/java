import java.util.Scanner;
public class controlflow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age = ");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("You are eligible to vote");
//        }
//        else{
//            System.out.println("You are not eligible to vote");
//        }

        //odd or even
        System.out.print("Enter num = ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }



    }
}
