class Account{
    private int accountno;
    private String name;
    private String phoneno;
    private String address;
    private String dob;
    private String emailid;
    private double balance;

    public void set(int accountno,String name,String phoneno,String address,
                    String dob, String emailid, double balance){
        this.accountno = accountno;
        this.name = name;
        this.phoneno = phoneno;
        this.address = address;
        this.dob = dob;
        this.emailid = emailid;
        this.balance = balance;
    }

    public void get(){
        System.out.println("Account no = "+ accountno+"\n" + "Name = "+name+"\n"+
                "Phone no = "+phoneno+"\n"+"Address = "+address+"\n"+
                "Date of birth = "+dob+"\n"+"Email id = "+ emailid);
    }

}
class SavingAccount extends Account{
public void deposit(int deposit){
    System.out.println("Deposit = " + deposit);
}
public void withdraw(int withdraw){
    System.out.println("Withdraw = "+ withdraw);
}
}
class loanaccount extends Account{
    public void payemi(int emi){
        System.out.println("EMI = " + emi);
    }
    public void topuuploan(int topuploan){
        System.out.println("Top up loan = "+ topuploan);
    }

}
public class inheritancepractise {
    public static void main(String[] args) {
    Account a = new Account();
    SavingAccount a2 = new SavingAccount();
    loanaccount a3 = new loanaccount();
    a2.set(23456, "Riya", "345678987", "panipat",
            "2004-02-12","max@gmail.com",45678.00);
    a2.get();
    a2.deposit(12345);
    a2.withdraw(9876);
    a3.payemi(5000);
    a3.topuuploan(20000);




    }
}
