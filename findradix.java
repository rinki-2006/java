import java.util.Scanner;
public class findradix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit = ");
        String digit = sc.nextLine();

        if(digit.matches("[01]+")){
            System.out.println("Radix is 2");
        }
        else if(digit.matches("[0-7]+")){
            System.out.println("Radix is 8");
        }
        else if(digit.matches("[0-9a-fA-F]+")){
            System.out.println("radix is 16");
        }
        else{
            System.out.println("The given digit is invalid");
        }
    }
}
