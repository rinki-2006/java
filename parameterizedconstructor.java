class mycircle2{
    private double radius;

    public mycircle2(double r){  //parametrized constructor
        radius = r;
    }
    public void display(){
        System.out.println("Area = " + Math.PI*radius*radius);
    }
}
public class parameterizedconstructor {
    public static void main(String[] args) {
        mycircle2 c1 = new mycircle2(10);
        c1.display();
    }
}
