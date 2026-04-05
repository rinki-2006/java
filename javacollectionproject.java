
import java.io.*;
import java.io.Serializable;
import java.util.*;

class Account1 implements Serializable{
    String accno;
    String name;
    double balance;

    Account1(){}

    Account1(String a,String n, double b){
        this.accno = a;
       this.name = n;
       this.balance = b;
    }
    public String toString(){
        return "Account no. = " + accno + "\n" + "Name = " + name + "\n" + "Balance = " + balance;
    }
}
public class javacollectionproject  {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Account1 acc = null;

        HashMap<String, Account1> hm = new HashMap<>();
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Account.txt");
            ObjectInputStream oi  = new ObjectInputStream(fis);
            //read how many count are there
            int count = oi.readInt();
            for(int i = 0; i<count; i++){
                acc = (Account1) oi.readObject();
                System.out.println(acc);
                hm.put(acc.accno, acc);
            }
            fis.close();
            oi.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        FileOutputStream fio = new FileOutputStream("C:\\Users\\HP\\Desktop\\use txt file in java\\Account.txt");
        ObjectOutputStream ou = new ObjectOutputStream(fio);

        System.out.println("Menu");
        int choice;
        String accno, name;
        double balance;
        do{
            System.out.println("1. Enter account");
            System.out.println("2. Delete account");
            System.out.println("3. View Account");
            System.out.println("4. View All Account");
            System.out.println("5. Save Account");
            System.out.println("6. Exit");

            System.out.println("Enter your choice = ");
            choice = sc.nextInt();
            sc.skip("(\r\n| [\n\r\u2028\u2029\u0085])?");

            switch(choice) {
                case 1:
                    System.out.println("Enter Details Accno, Name, Balance");
                    accno = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    acc = new Account1(accno, name, balance);
                    hm.put(accno, acc);
                    System.out.println("Account created for = " + name);
                    break;

                case 2:
                    System.out.println("Enter account number = ");
                    accno = sc.nextLine();
                    hm.remove(accno);
                    break;
                case 3 :
                    System.out.println("Enter Account = ");
                    accno = sc.nextLine();
                    acc = hm.get(accno);
                    System.out.println(acc);
                    break;
                case 4 :
                    for(Account1 a : hm.values()){
                        System.out.println(a);
                    }
                    break;
                case 5:
                case 6 :
                    ou.write(hm.size());  // first write size
                    for(Account1 a : hm.values()){
                        ou.writeObject(a);
                    }
            }
        }
        while(choice!=6);
        ou.flush();
        ou.close();
        fio.close();





    }
}
