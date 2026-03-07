class TV1{
    void switchon(){
        System.out.println("Switch on ");
    }
    void changechannel(){
        System.out.println("Change channel");
    }
}
class smartTv extends TV1{
    @Override
    void switchon(){
        System.out.println("switch on of sub class");
    }
    @Override
    void changechannel(){
        System.out.println("change channel of sub class");
    }
    void browse(){
        System.out.println(" Chrome option");
    }
}
public class practiseOR {
    public static void main(String[] args) {
        // object of super class
        TV1 t = new TV1();
        t.switchon();
        t.changechannel();
        // object of sub class
        smartTv s = new smartTv();
        s.switchon();
        s.changechannel();
        s.browse();
        // dynamic method dispatch
        TV1 r = new smartTv();
        r.changechannel();
        r.switchon();
    }
}
