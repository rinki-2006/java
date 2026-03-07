class ATM{
   synchronized public void checkbalance(String name){
        System.out.print(name + " checking");
        try{
            Thread.sleep(100);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(" balance");
    }
   synchronized public void withdraw(String name, int amount){
        System.out.print(name + " withdrawing");
        try{
            Thread.sleep(100);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(" "+  amount);
    }
}
class customer1 extends Thread{
    ATM a;
    String name;
    int amount;
    customer1(ATM a , String name, int amount){
        this.a = a;
        this.name = name;
        this.amount = amount;
    }
    public void useATM(){
        a.checkbalance(name);
        a.withdraw(name, amount);

    }
    public void run(){
        useATM();
    }
}
public class practisesunchronization {
    public static void main(String[] args) {
        ATM a = new ATM();
        customer1 c = new customer1(a, "riya", 107968);
        customer1 c2 = new customer1(a, "rinki", 123456);
        c.start();
        c2.start();

    }
}
