import java.util.Scanner;
public class displaydigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int r;
        int count = 0;  //count digit

        while(num>0){
            r = num%10; //store the last number
            num = num/10;  //delete the last number
            count++;
            System.out.println(r);
//            System.out.println(num);
        }
        System.out.println("count = " +count);
    }
}
