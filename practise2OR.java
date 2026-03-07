class car{
    void start(){
        System.out.println("Start function");
    }
    void accelerate(){
        System.out.println("Accelerate function ");
    }
    void changegear(){
        System.out.println("Change gear of super class");
    }
}
class luxurycar extends car{
    @Override
    void changegear(){
        System.out.println("Change gear of sub class");
    }
    void openroof(){
        System.out.println("Open roof function");
    }
}
public class practise2OR {
    public static void main(String[] args) {
//        car c = new car();
//        c.start();
//        c.accelerate();
//        c.changegear();

//        luxurycar l = new luxurycar();
//        l.start();
//        l.changegear();
//        l.openroof();

        // dynamic method dispatch
        car c1 = new luxurycar();
        c1.start();
        c1.accelerate();
        c1.changegear();

    }
}
