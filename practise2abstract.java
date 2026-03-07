abstract class KFC{
    KFC(){
        System.out.println("KFC outlet");
    }
    void makeitem(){
        System.out.println("Burger" + "\n" + "Noodles" + "\n" + "Sandwich");
    }
    abstract void billing();
    abstract void offer();
}

class MY_KFC extends KFC{
    MY_KFC(){
        System.out.println("open a KFC");
    }
    void billing(){
        System.out.println("Online mode and offline mode both are available");
    }
    void offer(){
        System.out.println("offer available at weekend");
    }
}
public class practise2abstract {
    public static void main(String[] args) {
        KFC k = new MY_KFC();
        k.makeitem();
        k.billing();
        k.offer();
    }
}
