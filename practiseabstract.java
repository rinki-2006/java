abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}
class My_Hospital extends Hospital{
    My_Hospital(){
        System.out.println("Constructor of sub class");
    }
    void emergency(){
        System.out.println("Emergency ");
    }
    void appointment(){
        System.out.println("Appointment");
    }
    void admit(){
        System.out.println("Admit");
    }
    void billing(){
        System.out.println("Billing");
    }
}
public class practiseabstract {
    public static void main(String[] args) {
        Hospital h = new My_Hospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
}
