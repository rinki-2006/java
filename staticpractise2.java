import java.util.*;
class Account4{
    private String accountno;

    private static int count = 20341;
    private String generateaccountno(){
        Date d = new Date();
        String an = "bank id -" + (d.getYear()+1900) + " " + count;
        count++;
       return an;
    }
    Account4(){
        accountno = generateaccountno();
    }
    public void display(){
        System.out.println(accountno);
    }
}
public class staticpractise2 {
    public static void main(String[] args) {
        Account4 a = new Account4();
        Account4 a2 = new Account4();
        Account4 a3 = new Account4();
        a.display();
        a2.display();
        a3.display();
    }
}
